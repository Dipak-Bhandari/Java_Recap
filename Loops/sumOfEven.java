package Loops;

import java.util.Scanner;

public class sumOfEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Num:");
        int a= sc.nextInt();
        int sum=0;
        for(int i =1; i<=a; i++){
            sum=sum + 2*i;
        }
        System.out.println("sum of even up to : "+a +" = "+sum);
    }
}
