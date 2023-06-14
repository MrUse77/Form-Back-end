/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.form.formulario.enums;
import com.form.formulario.interfaz.InterfazAuthority;
import com.form.formulario.interfaz.InterfazUsuario;
import com.form.formulario.models.authority;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
/**
 *
 * @author agusd
 */
@Component

public class Runner implements CommandLineRunner{
    private final InterfazAuthority AuthRepo;

    public Runner(InterfazUsuario UserRepo, InterfazAuthority AuthRepo) {
        this.AuthRepo = AuthRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        if(this.AuthRepo.count() == 0){
            this.AuthRepo.saveAll(List.of(
            new authority(AuthorityName.USER)
            ));
        }
        
    }
}
