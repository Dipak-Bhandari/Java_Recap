package funcMethods;

public class mathPreBuiltFunc {
    public static void main(String[] args) {

        // returns minimum value
        System.out.println("the min value : "+Math.min(4,5));

        // returns max value
        System.out.println("max value: "+Math.max(10,8));

        // returns absolute value it changes sign from -ve to +ve
        System.out.println("absolute value : "+Math.abs(3.4));
        System.out.println("-ve to +ve : "+Math.abs(-99));

        //returns power/exponential value
        System.out.println("Power of 3^2 :"+Math.pow(3,2));

        //returns square root
        System.out.println("square root of 81 : "+Math.sqrt(81));

        // returns floor value (5.8)-> 5
        System.out.println("floor value : "+Math.floor(5.8));

        //returns higher value closer to given value
        System.out.println("Celling value : "+Math.ceil(7.8));

        //returns round off value
        System.out.println("round off value : "+Math.round(5.9));
    }
}
