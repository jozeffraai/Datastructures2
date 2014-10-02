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
public class Student{
    private int studentNummer;
    private String klasNaam;
    private double cijfer;

    public Student(int studentNummer, String klasNaam, double cijfer) {
        this.studentNummer = studentNummer;
        this.klasNaam = klasNaam;
        this.cijfer = cijfer;
    }

    public int getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(int studentNummer) {
        this.studentNummer = studentNummer;
    }

    public String getKlasNaam() {
        return klasNaam;
    }

    public void setKlasNaam(String klasNaam) {
        this.klasNaam = klasNaam;
    }

    public double getCijfer() {
        return cijfer;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }   
}