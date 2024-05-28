package Loops;

import java.util.Scanner;

public class doWhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isUnderstood = false;
        do{
            System.out.println("Goto School");
            System.out.println("Have you understood ?");
            isUnderstood = sc.nextBoolean();
        }
        while (!isUnderstood);
        System.out.println("Good JOB !!");
    }
}
// used in cases where you need to at least once have to execute a loop
// Syntax: do{ body }while(condition);
