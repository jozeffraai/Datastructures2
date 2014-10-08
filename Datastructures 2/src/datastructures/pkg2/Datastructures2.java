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
        double rangeMin = 1.0;
        double rangeMax = 10.0;
        String klas;
        int aantalLeerlingen = 800;
        int b = aantalLeerlingen;
        int richtingNummer = 0;
        int getal = 1;
        int aantalKlassen = 4;
        int aantalKlassenPerRichting;
        
        int aantalStudentRichting = aantalLeerlingen / 4;
        aantalKlassen = klassenAantal(aantalStudentRichting, aantalKlassen);
        aantalKlassenPerRichting = aantalKlassen / 4;
        
        System.out.println(aantalKlassen); 
        System.out.println(aantalKlassenPerRichting);
        
        
       
        
        Random r = new Random();
        DecimalFormat df = new DecimalFormat("##.0");
        
        
        System.out.println("Klas\t\tStudent Nummer  \tCijfer");
        for (int i = 0; i < aantalLeerlingen; i++) {
            
            if (richtingNummer > 3){
                richtingNummer = 0;
            }
            if (getal > 4){
                getal = 1;
            }
            
            klas = richting[richtingNummer] + "20" + getal;
            richtingNummer++;
            
            if(richtingNummer == 4)
            getal++;
            
            double cijfer = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
            String result = df.format(cijfer);
            // generate cijfer
            
            Klas k = new Klas(klas);
            // maak klas aan
            Student a = new Student(studentnummer, result);
            // maak student aan 
            k.addStudent(a);
//            System.out.println(k.toString());
            studentnummer++;
        }
        
//        System.out.println(.toString);
    }
    
    
    public static int klassenAantal(int aantalStudentRichting, int aantalKlassen){
        
        if(aantalStudentRichting < 33){
            return aantalKlassen;
        }else {
            aantalStudentRichting = aantalStudentRichting - 32 ;
            aantalKlassen = aantalKlassen + 4;
            return klassenAantal(aantalStudentRichting, aantalKlassen);
        }
    }
    
}
