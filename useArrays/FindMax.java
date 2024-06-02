package useArrays;

public class FindMax {
    public static void main(String[] args) {
        int numbers[] = {5,2,78,11,44,33,88,45,65,9,89,99};
        int maxNum= numbers[0];

        for(int number : numbers){
            if(number>maxNum){
                maxNum=number;

            }

        }
        System.out.println("Max value in array is: "+maxNum);
    }
}
