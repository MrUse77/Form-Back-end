/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.form.formulario.interfaz;

import com.form.formulario.enums.AuthorityName;
import com.form.formulario.models.authority;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author agusd
 */
public interface InterfazAuthority extends JpaRepository<authority,Long>{
    Optional<authority> findByName(AuthorityName name); 
}
