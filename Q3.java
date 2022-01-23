import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your name : ");
        String s = sc.nextLine();
        System.out.print("Hello " + s + " have a great day.");
        sc.close();
    }
}
