/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.form.formulario.controller;

import com.form.formulario.interfaz.InterfazUsuario;
import com.form.formulario.models.usuario;
import com.form.formulario.service.IUsuarioService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author agusd
 */
@CrossOrigin(origins="/**", maxAge=3600)
@RestController
public class UsuarioController {
    
    @Autowired
    private InterfazUsuario UserRepo;
    @Autowired
    private IUsuarioService interUser;
    @Autowired
    
    
    @GetMapping("/traer")
    public List<usuario> getUsuarios(){
        return interUser.getUsuarios();
    }
    
    @GetMapping("/traer/{mail}")
    public usuario FindUsuario(@PathVariable String mail){
        return interUser.findUsuario(mail);
    }
    
 @PostMapping("/crear")
public ResponseEntity<ApiResponse> registerUser(@Valid @RequestBody usuario newUser) {
    // Chequear si el usuario ya existe
    usuario existingUser = UserRepo.findByNameOrMail(newUser.getName(), newUser.getMail());
    if (existingUser != null) {
            return ResponseEntity.ok(new ApiResponse("Usuario ya existente"));
    }
     PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    usuario encodedUser = new usuario(newUser.getName(),
                                      newUser.getLastName(),
                                      newUser.getMail(),
                                      passwordEncoder.encode(newUser.getPassword())
    )
                                      ;
    
    UserRepo.save(encodedUser);
    return ResponseEntity.ok(new ApiResponse("Usuario Creado"));
}

    
    
}
