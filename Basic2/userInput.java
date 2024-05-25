package Basic2;
import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
//        System.out.println("What is your name?");
//        String firstName=sc.nextLine();
//        String lastName=sc.nextLine();
//
//        System.out.println("Enter your age ");
//        int age= sc.nextInt();
//
//
//        System.out.println("Hello  " +firstName +lastName);
//        System.out.println("Your age is  " +age);


        System.out.println("first number: ");
        float Num1=sc.nextFloat();

        System.out.println("second Num: ");
        int Num2=sc.nextInt();

        int result = (int)(Num1+Num2); // TYPE CONVERSION
        System.out.println("result is: "+result);

        sc.close();
    }
}
