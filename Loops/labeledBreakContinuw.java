package Loops;

public class labeledBreakContinuw {
    public static void main(String[] args) {
        // label is a name given to a loop so that it can be called in order to perform specific actions

        //outerLoop: //this is a label

        for (int i = 1; i <=5 ; i++) {
            innerLoop:
            for (int j = i; j <=5; j++) {

                if(j==2)continue innerLoop;

                System.out.print(j+" ");

            }
            System.out.println();

            // it is not a recommended practice as it makes code unreadable.

            // label is used to terminate loops inside loops(nested loop)
        }
    }
}
