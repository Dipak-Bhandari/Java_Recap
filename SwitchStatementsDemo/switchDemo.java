package SwitchStatementsDemo;
import java.util.*;
public class switchDemo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");

        int a= sc.nextInt();
        switch (a){
            case 1:
                System.out.println("HAHA");
                break;

            case 2:
                System.out.println("OH la la");
                break;

            default:
                System.out.println("Invalid");

        }
    }
}
