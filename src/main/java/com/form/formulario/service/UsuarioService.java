/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.form.formulario.service;
import com.form.formulario.interfaz.InterfazUsuario;
import com.form.formulario.models.usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author agusd
 */
@Service
public class UsuarioService implements IUsuarioService{
      
    @Autowired
    private InterfazUsuario UserRepo;

    @Override
    public List<usuario> getUsuarios() {
        return UserRepo.findAll();
    }

    @Override
    public void saveUsuario(usuario user) {
        UserRepo.save(user);
    }

    @Override
      public usuario findUsuario(String mail) {
        usuario user = UserRepo.findByMail(mail);
        return user;
   }



    
    
    
}
