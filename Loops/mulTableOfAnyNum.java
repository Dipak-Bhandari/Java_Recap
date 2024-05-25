package Loops;

import java.util.Scanner;

public class mulTableOfAnyNum {

    //This is to print multiplication tables of given number up to 10

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int a = sc.nextInt();
        for(int i=1; i<= 10; i++){  // i=1; i<=10; (from 1 up to 10)

            System.out.println(a+" *" +i +" = " +i*a); //print 'a' * 'i' = a*i
        }
    }
}
