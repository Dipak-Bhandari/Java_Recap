package CONDITIONAL;
import  java.util.*;
public class findMaxNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Num A: ");
        int a= sc.nextInt();
        System.out.println("Enter Num B: ");
        int b= sc.nextInt();
        System.out.println("Enter Num C: ");
        int c= sc.nextInt();

        if(a> b && a>c) {
            System.out.println(a + " Is the Greatest.");
        }
        else if(b>a && b>c){
                    System.out.println(b+ "  is the greatest");
            }

        else{
            System.out.println(c+ " is the greatest");
        }
    }
}
