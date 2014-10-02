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
public class Student extends Klas{
    private int studentNummer;    
    private double cijfer;
    private Klas klas;

    public Student(int studentNummer, double cijfer, Klas klas, String klaNaam, int aantalLeerlingen, String richting) {
        super(klaNaam, aantalLeerlingen, richting);
        this.studentNummer = studentNummer;
        this.cijfer = cijfer;
        this.klas = klas.getNaam();
    }

    public int getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(int studentNummer) {
        this.studentNummer = studentNummer;
    }

    public double getCijfer() {
        return cijfer;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    public Klas getKlas() {
        return klas;
    }

    public void setKlas(Klas klas) {
        this.klas = klas;
    }

    @Override
    public String toString() {
        return "Student{" + "studentNummer=" + studentNummer + ", cijfer=" + cijfer + ", klas=" + klas + '}';
    }
    
    
}
