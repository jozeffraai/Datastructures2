/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author bob
 */
public class Klas {
    private String naam;
    private static final int maxAantalLeerlingen = 32;    
    private ArrayList<Student> student;

    public Klas(String klasNaam) {
        this.naam = klasNaam;   
        
        student = new ArrayList<Student>();
    }
    
    public Klas() {
        
    }
    

    public String getNaam() {
        return naam;
    }

    public void setNaam(String Naam) {
        this.naam = Naam;
    }

    public void addStudent(Student s){
        student.add(s);
    }
    
    public void showStudents(){
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i) + "\t"+ this.toString());
        }
        System.out.println("");
    }

    @Override
    public String toString() {
        return naam;
    }
    
    
    
    
    
  
}
