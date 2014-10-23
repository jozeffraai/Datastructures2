/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.pkg2;

import java.text.DecimalFormat;
import java.util.ArrayList;
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
        for (int i = 0; i < aantalKlassen; i++) {

            Klas k = new Klas();

            if (counter <= 3) {
                k.setNaam(richting[counter] + kn);
                klassen.add(k);

                counter++;
                if (counter == 4) {
                    counter = 0;
                    kn++;
                }
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
            }

            studenten[i] = s;
        }

        // maak random generator aan
//        int kn = 201;
        System.out.println("StudentNummer\tCijfer\tKlas");
        for (Student s : studenten) {
            System.out.println(s);
        }

        System.out.println(aantalKlassen);

        for (int l = 0; l < aantalKlassenPerRichting; l++) {

            Klas a1 = new Klas(richting[0] + kn);
            Klas a2 = new Klas(richting[1] + kn);
            Klas a3 = new Klas(richting[2] + kn);
            Klas a4 = new Klas(richting[3] + kn);

//            System.out.println(kn);
            for (int i = 0; i < aantalLeerlingen; i++) {

                // genereer een random cijfer
                double cijfer1 = 1.0 + (10.0 - 1.0) * r.nextDouble();
                String result1 = df.format(cijfer1);
                double cijfer2 = 1.0 + (10.0 - 1.0) * r.nextDouble();
                String result2 = df.format(cijfer2);
                double cijfer3 = 1.0 + (10.0 - 1.0) * r.nextDouble();
                String result3 = df.format(cijfer3);
                double cijfer4 = 1.0 + (10.0 - 1.0) * r.nextDouble();
                String result4 = df.format(cijfer4);

                // maak student aan 
                Student s1 = new Student(studentnummer, result1);
                studentnummer++;
                Student s2 = new Student(studentnummer, result2);
                studentnummer++;
                Student s3 = new Student(studentnummer, result3);
                studentnummer++;
                Student s4 = new Student(studentnummer, result4);
                studentnummer++;

//            System.out.println(s1);
                studentnummer++;

                a1.addStudent(s1);
                a2.addStudent(s2);
                a3.addStudent(s3);
                a4.addStudent(s4);

            }

//            a1.showStudents();
//            a2.showStudents();
//            a3.showStudents();
//            a4.showStudents();
            kn++;
        }

//        System.out.println("Student Nummer  \tCijfer");
//        for (int i = 0; i < aantalLeerlingen; i++) {
//
//            // genereer een random cijfer
//            double cijfer = 1.0 + (10.0 - 1.0) * r.nextDouble();
//            String result = df.format(cijfer);
//
//            // maak student aan 
//            Student a = new Student(studentnummer, result);
//
//            System.out.println(a);
//            studentnummer++;
//        }
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
