package ExcetptionPHandling;

//try catch is a basic exception handling method
//inside try block you give the exception that might occur
//inside catch block you catch exception and print the occurred exception
public class tryCatchBlock {

    public static void main(String[] args) {
         try {
             int a = 5;
             int b = 0;
             int ans = a/b;

         }
         catch (ArithmeticException e ){
             System.out.println("Exception : "+e.getMessage());
         }
//executes if there is any exception or not
         finally {
             System.out.println("Out of this !!");
         }
    }

}
