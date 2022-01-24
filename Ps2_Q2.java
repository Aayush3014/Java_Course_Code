import java.util.GregorianCalendar;

public class Ps2_Q2 {
    public static void main(String[] args) {
        char grade = 'A';
        grade = (char)(grade+8);
        System.out.println(grade); //Encryption

        grade = (char) (grade-8);
        System.out.println(grade); //Decryption
    }
}
