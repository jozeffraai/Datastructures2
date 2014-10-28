package generatestudents;

import hashfunction.HashFunction;

/**
 *
 * @author breud
 */
public class GenerateStudents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StudentList students = new StudentList(10000);

        Student[] naam = students.getList();
        int[] modeloNaam = new int[10000];

        for (int i = 0; i < naam.length; i++) {
            String t = naam[i].getLdap();
            int m = (int) toAscii(t);
            modeloNaam[i] = m;
        }

        //Collisions tellen zonder hash table
        int[] tellen = new int[97];
        for (int i = 0; i < modeloNaam.length; i++) {
            int waarde = modeloNaam[i];
            tellen[waarde]++;
        }
        for (int i = 0; i < tellen.length; i++) {
            System.out.println(tellen[i]);
        }
    }

    public static long toAscii(String s) {
        StringBuilder sb = new StringBuilder();
        String ascString = null;
        long asciiInt;
        for (int i = 0; i < s.length(); i++) {
            sb.append((int) s.charAt(i));
            char c = s.charAt(i);
        }
        ascString = sb.toString();
        asciiInt = Long.parseLong(ascString);
        return asciiInt % 97;
    }
}
