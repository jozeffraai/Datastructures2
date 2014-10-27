
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
        
        for (int i = 0; i < naam.length; i++) {
            String test = naam[i].getLdap();
            long modelo = toAscii(test) % 10007;
            System.out.println(modelo);
        }
    }
    
    
    public static long toAscii(String s){
        StringBuilder sb = new StringBuilder();
        String ascString = null;
        long asciiInt;
                for (int i = 0; i < s.length(); i++){
                    sb.append((int)s.charAt(i));
                    char c = s.charAt(i);
                }
                ascString = sb.toString();
                asciiInt = Long.parseLong(ascString);
                return asciiInt;
    }
}
