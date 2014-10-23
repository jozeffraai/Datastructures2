/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.pkg2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import models.*;
import nl.hva.dmci.ict.inf.ads.lib.StdRandom;

/**
 *
 * @author Jozef Fraai
 */
public class Datastructures2 {

    /**
     * @param args the command line arguments
     */
    private static String[] richting = {"G", "N", "S", "T"};
    private static String[] laatsteGetal = {"1", "2", "3", "4"};

    public static void main(String[] args) {
        int studentnummer = 50060001;

        String klas;
        int aantalLeerlingen = 200;
        int aantalKlassen = 4;
        int aantalKlassenPerRichting;

        // bereken hoeveel klassen er moeten worden aangemaakt
        int aantalStudentRichting = aantalLeerlingen / 4;
        aantalKlassen = klassenAantal(aantalStudentRichting, aantalKlassen);
        aantalKlassenPerRichting = aantalKlassen / 4;

        ArrayList<Klas> klassen = new ArrayList();

        int counter = 0;
        int kn = 201;
        for (int i = 0; i < aantalKlassen+1; i++) {

            Klas k = new Klas();

            if (counter <= 3) {
                k.setNaam("I"+richting[counter] + kn);
                klassen.add(k);
                counter++;
            }else if (counter == 4) {
                    counter = 0;
                    kn++;
                } 
        }

        Student[] studenten = new Student[aantalLeerlingen];

        Random r = new Random();
        DecimalFormat df = new DecimalFormat("##.0");
        counter = 0;
        for (int i = 0; i < studenten.length; i++) {
            Student s = new Student();
            s.setStudentNummer(studentnummer);
            studentnummer++;
            double cijfer = 1.0 + (10.0 - 1.0) * r.nextDouble();
            String result = df.format(cijfer);
            s.setCijfer(result);

            if (counter < klassen.size()) {
                Klas k = klassen.get(counter);
                s.setKlas(k);
                counter++;
            }
            if (counter == klassen.size()) {
                    counter = 0;
                } 

            studenten[i] = s;
        }
        StdRandom.shuffle(studenten);
        System.out.println("StudentNummer\tCijfer\tKlas");
        for (Student s : studenten) {
            System.out.println(s);
        }
    }
    
    public static int klassenAantal(int aantalStudentRichting, int aantalKlassen) {

        if (aantalStudentRichting < 33) {
            return aantalKlassen;
        } else {
            aantalStudentRichting = aantalStudentRichting - 32;
            aantalKlassen = aantalKlassen + 4;
            return klassenAantal(aantalStudentRichting, aantalKlassen);
        }
    }

}
