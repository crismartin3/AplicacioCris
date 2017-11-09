/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testatletes;

import java.util.Scanner;

/**
 *
 * @author cris_
 */
public class TestAtletes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean fi = false;
        Scanner teclat = new Scanner(System.in);

        Atleta[] taulaAtletes = new Atleta[20];
        int i = 0;
        while (!fi && i < taulaAtletes.length) {
            System.out.println("Vols introduir un altre atleta?");
            String entrada;
            entrada = teclat.nextLine();
            if (entrada.equals("no")) {
                fi = true;
            } else if (entrada.equals("si")) {
                String nom, cognom, club;
                int telefon = 0;
                System.out.println("Introdueix el nom:");
                nom = teclat.nextLine();
                System.out.println("Introdueix el cognom:");
                cognom = teclat.nextLine();
                System.out.println("Introdueix el club:");
                club = teclat.nextLine();
                System.out.println("És de Catalunya o Internacional? Cita el país:");
                if (teclat.nextLine().equals("CAT")) {
                    System.out.println("Esta federat?");
                    if (teclat.nextLine().equals("si")) {
                        String nllicencia;
                        System.out.println("Introdueix el número de Llicència:");
                        nllicencia = teclat.nextLine();
                        taulaAtletes[i++] = new Federat(nom, cognom, telefon, club, nllicencia);
                        
                    } else {
                        int dia, mes, any;
                        System.out.println("Introdueix el dia, mes i any:");
                        dia = teclat.nextInt();
                        mes = teclat.nextInt();
                        any = teclat.nextInt();
                        taulaAtletes[i++] = new NoFederat(nom, cognom, telefon, club, dia, mes, any);
                       
                    }
                } else {
                    String pais;
                    System.out.println("Introdueix el país:");
                    pais = teclat.nextLine();
                    //INCREMENTA EL I++ DESPRES DE HAVER AFEGIT LES DADES AUGMENTA!
                    taulaAtletes[i++] = new Internacional(nom, cognom, telefon, club, pais);
                }
            }
        }
        for (int j = 0; j < i; j++) {
            System.out.println(taulaAtletes[j] + "\n");
        }
        
    }

}
