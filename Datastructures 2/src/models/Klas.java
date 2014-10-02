/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author bob
 */
public class Klas {
    private String naam;
    private static final int maxAantalLeerlingen = 32;
    private int aantalLeerlingen;
    private String richting;

    public Klas(String klaNaam, int aantalLeerlingen, String richting) {
        this.naam = klaNaam;
        this.aantalLeerlingen = aantalLeerlingen;
        this.richting = richting;
    }
    
    

    public String getNaam() {
        return naam;
    }

    public void setNaam(String klaNaam) {
        this.naam = klaNaam;
    }

    public int getAantalLeerlingen() {
        return aantalLeerlingen;
    }

    public void setAantalLeerlingen(int aantalLeerlingen) {
        this.aantalLeerlingen = aantalLeerlingen;
    }

    public String getRichting() {
        return richting;
    }

    public void setRichting(String richting) {
        this.richting = richting;
    }
    
    
    
    
  
}
