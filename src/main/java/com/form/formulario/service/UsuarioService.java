/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.form.formulario.service;
import com.form.formulario.interfaz.InterfazAuthority;
import com.form.formulario.interfaz.InterfazUsuario;
import com.form.formulario.models.authority;
import com.form.formulario.models.usuario;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
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
       @Autowired
    private InterfazAuthority AuthRepo;

    @Override
    public List<usuario> getUsuarios() {
        return UserRepo.findAll();
    }

    @Override
    public void saveUsuario(usuario user) {
        UserRepo.save(user);
    }

    @Override
    public List<usuario> findUsuario(String mail){
       return UserRepo.findByMail(mail);
    }

    @Override
    public List<authority> getAuthority() {
              List<authority> listaAuth = AuthRepo.findAll();
        return listaAuth;
    }
    
    
    
}
