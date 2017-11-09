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
public class Internacional extends Atleta {
    private String pais;
    public Internacional(String nom, String cognoms, int telefon, String club, String pais) {
        super(nom, cognoms, telefon, club);
        this.pais = pais;
    }

    @Override
    public String toString() {
        return super.toString() + "pais=" + pais + '}';
    }
    
    
}
