package useArrays;

public class ProblemsOnArrays {
    public static void main(String[] args) {

        int numbers[] = {23,12,6,7,15,3,2,56};
        int sum=0;
        int minnum=Integer.MAX_VALUE; // this holds the maximum value of int
        System.out.println(minnum);
        // sum of every number using foreach loop
        for(int number:numbers){
            sum =sum+number;
            if(number<minnum){  //compares all number with max value
                minnum=number;  // after comparing minimum value is stored and
                                // iterated for any other minvalue in array
            }

        }

        // sum of every number using basic for loop
//        for (int i = 0; i <numbers.length ; i++) {
//            sum +=numbers[i];
//        }

            System.out.println("Total : "+sum);
        System.out.println("minimum is: "+minnum);
    }
}
