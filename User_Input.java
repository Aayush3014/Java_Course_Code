// User input by Scanner Class.

import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        System.out.print("Input number : ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println("Entered number is : " + s);
        sc.close();
    }
}

