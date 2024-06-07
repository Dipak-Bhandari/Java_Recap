package SwitchStatementsDemo;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet : ");
        char alpha = sc.next().charAt(0);

        if ((alpha>='A' && alpha<= 'z') ||( alpha>='a'&& alpha<='z'))

        {
            switch (alpha){

                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':

                    System.out.println("It is a Vowel.");
                    break;

                default:
                    System.out.println("It is a Consonant.");
            }


        }
        else{
            System.out.println("Not an alphabet dumb!!");

        }

    }
}
