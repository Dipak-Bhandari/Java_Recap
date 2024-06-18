package funcMethods;

public class decFunc {
//this is greet func with default specifiers and void return
     static void  greet(){
        System.out.println("welcome to the function.");
    }
    //method parameters and int return type
    public static int addNum(int a, int b){
         int sum = a+b;
        System.out.println("the sum : "+sum);
         return sum;
    }

    //
    public static int avgNum(int a, int b){
         int avg = (a+b)/2;
        System.out.println("The average value : "+avg);
         return avg;
    }

    public static void main(String[] args) {
        //calling the func greet
        //func should be static while calling in static method
        greet();

        //calling addNum method & giving the int parameters
        addNum(5,6);
        //calling the avgNum function & passing the parameters
        avgNum(88,33);
    }
}
