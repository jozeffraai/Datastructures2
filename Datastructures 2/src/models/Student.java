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
    private String cijfer;

    public Student(int studentNummer, String klasNaam, String cijfer) {
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

    public String getCijfer() {
        return cijfer;
    }

    public void setCijfer(String cijfer) {
        this.cijfer = cijfer;
    }

    @Override
    public String toString() {
        return "Student{" + "studentNummer=" + studentNummer + ", klasNaam=" + klasNaam + ", cijfer=" + cijfer + '}';
    }
}