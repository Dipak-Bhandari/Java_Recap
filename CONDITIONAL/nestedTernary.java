package CONDITIONAL;

public class nestedTernary {

    public static void main(String[] args) {
        // Initialize three numbers to check which is the largest/smallest

        int a = 634;
        int b = 543;
        int c = 742;

        //initialize a variable to store result
        int max;

        //now ternary
        // first check if a is greatest of all if yes print a otherwise c
        // then b is checked if yes print b otherwise c

        max= a>b? a>c? a:c :b>c? b:c;

        System.out.println("The largest among them : "+max);

    }
}
