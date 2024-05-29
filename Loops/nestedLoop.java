package Loops;

public class nestedLoop {
    public static void main(String[] args) {

        // can do with all loops like : for, while, do-while
//        for (int i = 0; i <5 ; i++) {
//            for (int j = 0; j <=i ; j++) {
//                System.out.print("- ");         // prints a patten
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < 5; i++) {
//            int j=0;
//            while (j<=5){
//                System.out.print(j+" ");          // prints j upto 5 times 0 1 2 3 4 5
//                j++;
//            }
//            System.out.println();
//        }

//        for (int i = 0; i <=5 ; i++) {
//            for (int j = 0; j <=i; j++) {     // prints star pattern
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        // for(int i=1; i<=5; i++): increasing loop  1 to 4

//        for (int i = 1; i <=5 ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        // for (int i = 5; i >=1 ; i--): decreasing loop 5 to 1

//        for (int i = 5; i >=1 ; i--) {
//            for (int j =1; j<=i ; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j =i; j<=n ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }

            System.out.println();
        }
    }
}
