/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testatletes;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author cris_
 */
public class NoFederat extends Atleta {
    private LocalDate dataNaix;
    
    public NoFederat(String nom, String cognoms, int telefon, String club, int any, int mes, int dia) {
        super(nom, cognoms, telefon, club);
        this.dataNaix = LocalDate.of(any, mes, dia);
    }

    @Override
    public String toString() {
        return super.toString() + "dataNaix=" + dataNaix + '}';
    }
    

  
    
}
