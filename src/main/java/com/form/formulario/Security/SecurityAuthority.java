/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.form.formulario.Security;

import com.form.formulario.models.authority;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author agusd
 */
@AllArgsConstructor
public class SecurityAuthority implements GrantedAuthority{
    
    private final authority authority;

    @Override
    public String getAuthority() {
        return authority.getName().toString();
    }
    
}
