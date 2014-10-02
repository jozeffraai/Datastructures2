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
    public static void main(String[] args) {
        int klasnummer = 50060001;
        double rangeMin = 1.0;
        double rangeMax = 10.0;
        
        Random r = new Random();
        DecimalFormat df = new DecimalFormat("##.#");
        
//        Klas IS201 = new Klas("IS201", 20, "SE");
//        Student jozef = new Student(50060001, "IS201", 5.5);
        
//        System.out.println(df.format(cijfer));
        
        for (int i = 0; i < 20; i++) {
            double cijfer = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
            String result = df.format(cijfer);
            Student a = new Student(klasnummer, "IS201", result);
            System.out.println(a.toString());
            klasnummer++;
        }
        
    }
    
}
