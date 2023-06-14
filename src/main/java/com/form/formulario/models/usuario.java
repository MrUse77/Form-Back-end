/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.form.formulario.models;

/**
 *
 * @author agusd
 */
import jakarta.persistence.*;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity(name="usuario")
public class usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id;
    @Column
    public String name;
    @Column 
    public String lastName;
    @Column
    public String mail;
    @Column 
    public String password;
    @ManyToMany
    @JoinTable(name="rol_usuario", 
               joinColumns=@JoinColumn(name="persona_id",referencedColumnName="id"), 
               inverseJoinColumns=@JoinColumn(name="rol_id",referencedColumnName="id"))
    private List<authority> Rol;

    public usuario(String name, String lastName, String mail, String password, List<authority> Rol) {
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
        this.password = password;
        this.Rol = Rol;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<authority> getRol() {
        return Rol;
    }

    public void setRol(List<authority> Rol) {
        this.Rol = Rol;
    }

   


    


  

}
