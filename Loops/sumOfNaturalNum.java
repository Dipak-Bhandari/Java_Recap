package Loops;

import java.util.Scanner;

public class sumOfNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a NUM: ");
        int a = sc.nextInt();
        int sum=0;
        for (int i = 1; i<=a; i++) {
            sum= sum+i;

        }
        System.out.print("Sum of natural number up to :"+a +"= " +sum);
    }
}