/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.pkg2;

import java.text.DecimalFormat;
import java.util.Random;
import models.*;

/**
 *
 * @author Jozef Fraai
 */
public class Datastructures2 {

    /**
     * @param args the command line arguments
     */
    private static String[] richting = {"IG", "IN", "IS", "IT"};
    private static String[] laatsteGetal = {"1", "2", "3", "4"};

    public static void main(String[] args) {
        int studentnummer = 50060001;

        String klas;
        int aantalLeerlingen = 800;
        int richtingNummer = 0;
        int counter = 1;
        int aantalKlassen = 4;
        int aantalKlassenPerRichting;

        // bereken hoeveel klassen er moeten worden aangemaakt
        int aantalStudentRichting = aantalLeerlingen / 4;
        aantalKlassen = klassenAantal(aantalStudentRichting, aantalKlassen);
        aantalKlassenPerRichting = aantalKlassen / 4;

        // maak random generator aan
        Random r = new Random();
        DecimalFormat df = new DecimalFormat("##.0");

        System.out.println("Klas\t\tStudent Nummer  \tCijfer");
        for (int i = 0; i < aantalLeerlingen; i++) {

            if (richtingNummer > 3) {
                richtingNummer = 0;
            }
            if (counter > 4) {
                counter = 1;
            }

            klas = richting[richtingNummer] + "20" + counter;
            richtingNummer++;

            if (richtingNummer == 4) {
                counter++;
            }

            // genereer een random cijfer
            double cijfer = 1.0 + (10.0 - 1.0) * r.nextDouble();
            String result = df.format(cijfer);

            // maak klas aan
            Klas k = new Klas(klas);

            // maak student aan 
            Student a = new Student(studentnummer, result);

            k.addStudent(a);
            System.out.println(k.toString());
            studentnummer++;
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
