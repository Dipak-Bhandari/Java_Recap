package randomNumGenerate;

class randNum {
    public static void main( String[] args ) {
// using math.Random() to generate random numbers

        int min= 1;
        int max=6;
        //
         int random_Num = (int)Math.floor(Math.random()*(max-min+1)+min);

        System.out.println("The random number is : "+random_Num);

    }
}
