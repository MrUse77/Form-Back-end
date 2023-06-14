/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.form.formulario.service;
import com.form.formulario.Security.SecurityUser;
import com.form.formulario.interfaz.InterfazUsuario;
import com.form.formulario.models.usuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author agust
 */
@Service
public class SecurityUserDetailsService implements UserDetailsService{

    private static final Logger logger = Logger.getLogger(SecurityUserDetailsService.class.getName());
    private final InterfazUsuario UserRepo;
    
      public SecurityUserDetailsService(InterfazUsuario PersoRepo) {
        this.UserRepo = PersoRepo;
    }
 @Override
public UserDetails loadUserByUsername(String mail) throws UsernameNotFoundException {
    logger.log(Level.INFO, "Buscando usuario con nombre de usuario: {0}", mail);
    usuario usuario = UserRepo.findOneByMail(mail).orElseThrow(()-> new UsernameNotFoundException("El usuario con email"+mail+"no existe"));
    return new SecurityUser(usuario);
}

    
   
    
}