package Loops;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        // while loops is used when we know when a loop is going to stop/end
        // while(noend){sout(keep going)}
//        int a =0;
//        while(a<5){
//            System.out.println(a);
//            a++;
//                   }
        Scanner sc = new Scanner(System.in);
        boolean isUnderstood =false ;
        while(!isUnderstood){
            System.out.println("goto school");
            System.out.println("Did You understand ? ");
            isUnderstood = sc.nextBoolean();
        }
    }
}
