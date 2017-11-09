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
public abstract class Atleta {
    
    private String nom, cognoms;
    private int telefon;
    private String club;

    public Atleta(String nom, String cognoms, int telefon, String club) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.telefon = telefon;
        this.club = club;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "Atleta{" + "nom=" + nom + ", cognoms=" + cognoms + ", telefon=" + telefon + ", club=" + club + '}';
    }

}
