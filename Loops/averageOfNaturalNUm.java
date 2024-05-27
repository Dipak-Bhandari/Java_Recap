package Loops;

import java.util.Scanner;

public class averageOfNaturalNUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int a = sc.nextInt();
        int sum=0;
        int Avg=0;
        for (int i=1; i<=a; i++) {
            sum= sum+i;

        }
        Avg= sum/2;
        System.out.println("Average of natural numbers upto- "+a +" = "+Avg);
    }
}
