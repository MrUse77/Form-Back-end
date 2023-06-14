/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.form.formulario.models;
import com.form.formulario.enums.AuthorityName;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 *
 * @author agusd
 */
@Getter @Setter @NoArgsConstructor
@Entity(name="authority")
public class authority{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    private AuthorityName name;

    public authority(AuthorityName AuthorityName) {
        this.name = AuthorityName;
    }


    
    
}
