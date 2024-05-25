package CONDITIONAL;
public class ternaryDemo {

    public static void main(String[] args) {
        //    initialize variables
        int a=4;
        int b=5;
        int max= 0;
//    ternary => Condition ? expression1 : expression2;
        max = a>b ? a : b;

        System.out.println("VALUE OF MAX :  " +max);
    }
}
