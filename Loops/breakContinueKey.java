package Loops;

public class breakContinueKey {
    public static void main(String[] args) {

//        for (int i = 0; i <=20 ; i++) {         // prints up to 20
//            System.out.println(i);              //  prints value of i
//            if(i>=15)break;                     // prints only numbers that satisfies condition
//        }
// also same for while/do-while loops
//        int a=0;
//        while(a<=5){
//           System.out.println(a);         // while(condition) {
//           a++;                           //  code
//           if(a==3)break;                 //  if(condition to break){ break;} }
//        }

//
//        int b=0;
//            do{
//                if(b>4)break;
//                System.out.println(b);
//                b++;
//            }while(b<8);


//
//        for (int i = 0; i <=20 ; i++) {
//            if(i==15) {
//                continue;
//            }
//            System.out.println(i);
//        }
//        int i = 0;
//        do{
//            if(i==4) continue;
//            System.out.println(i);
//            i++;
//        }while (i<=6);

        for (int i = 0; i <=20 ; i++) {
            if(i==2 || i==8) continue;
            if (i>=15)break;
            System.out.println("gave tofee to "+i);
        }
    }
}


