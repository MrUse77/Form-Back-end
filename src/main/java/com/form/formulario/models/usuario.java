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
import lombok.NoArgsConstructor;

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

    public usuario(String name, String lastName, String mail, String password) {
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
        this.password = password;
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

   


    


  

  

}
