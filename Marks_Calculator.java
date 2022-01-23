import java.util.Scanner;

public class Marks_Calculator {
    public static void main(String[] args) {

        System.out.println("Enter Marks : ");
        Scanner sc = new Scanner(System.in);

        Float eng = sc.nextFloat();
        Float hin = sc.nextFloat();
        Float mat = sc.nextFloat();
        Float sci = sc.nextFloat();
        Float sst = sc.nextFloat();
        Float per = (((eng + hin + mat + sci + sst) / 500) * 100);
        sc.close();
        System.out.println(eng);
        System.out.println(hin);
        System.out.println(mat);
        System.out.println(sci);
        System.out.println(sst);
        System.out.println("Percentage of 5 Subjects is " + per);

    }

}
