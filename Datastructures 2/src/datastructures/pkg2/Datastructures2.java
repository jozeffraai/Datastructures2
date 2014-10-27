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

    private static final String[] richting = {"G", "N", "S", "T"};

    public static void main(String[] args) {
        int studentnummer = 50060001;
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
        DecimalFormat df = new DecimalFormat(".0");
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
//            System.out.println(s);
        }
        int [] test = {1,5,9,6,2,8,7,4,3};
        System.out.println(Arrays.toString(test));
        BubbleSort(test);
        System.out.println(Arrays.toString(test));
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
    
    public static void BubbleSort( int [ ] sort ) {
     boolean flag = true;   // set flag to true to begin first pass
     int temp;   //holding variable

     while ( flag )
     {
            flag= false;    //set flag to false awaiting a possible swap
            for(int i=0;  i < sort.length -1;  i++ )
            {
                   if ( sort[ i ] > sort[i+1] )   // change to > for ascending sort
                   {
                           temp = sort[ i ];                //swap elements
                           sort[ i ] = sort[ i+1 ];
                           sort[ i+1 ] = temp;
                          flag = true;              //shows a swap occurred  
                  } 
            } 
      } 
} 

}
