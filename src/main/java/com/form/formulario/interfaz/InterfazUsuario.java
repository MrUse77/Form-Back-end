/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.form.formulario.interfaz;

import com.form.formulario.models.usuario;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author agusd
 */
@Repository
public interface InterfazUsuario extends JpaRepository<usuario, Long>{
    
    usuario findByMail(String mail);
    Optional<usuario> findOneByMail(String mail);
    

    public usuario findByNameOrMail(String name, String mail);

}
