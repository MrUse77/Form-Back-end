/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.form.formulario.service;
import com.form.formulario.models.usuario;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author agusd
 */
@Component
public interface IUsuarioService {
    public List<usuario> getUsuarios();
    public void saveUsuario(usuario user);
    public usuario findUsuario(String mail);
}
