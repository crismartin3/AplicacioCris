/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testatletes;

/**
 *
 * @author cris_
 */
public class Federat extends Atleta {
    private String nllicencia;
    
    public Federat(String nom, String cognoms, int telefon, String club, String nllicencia) {
        super(nom, cognoms, telefon, club);
        this.nllicencia = nllicencia;
    }

    @Override
    public String toString() {
        return super.toString()+ "Num Llicència: " + nllicencia;
    }

    

    
}
