package CONDITIONAL;

import java.util.*;

public class primeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();

        int count = 0;
        if (a <= 1) {

            System.out.println(a + " is neither Prime nor Composite number");
        } else {


            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    count++;
                }
            }
        }

        if (count == 2) {
            System.out.println(a + "  is Prime Number");

        } else {
            System.out.println(a + "  is not a Prime Number");
        }
    }
}
