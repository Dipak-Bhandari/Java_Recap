package useArrays;

import java.util.Scanner;

public class FindingMiinArray {
    public static void main(String[] args) {
        int numbers[]={15,25,45,75,85,32,11,4,3,75,87,12,1,2};
        int min = numbers[0]; // initialize min to first index of array
//
        for(int number: numbers){
            if(number < min){  // if number is less than min then
                min = number;  // min will be number and
                                // loop continues until satisfied
            }
        }

//
//        for (int i = 0; i <numbers.length ; i++) {
//            if(numbers[i]<min){
//                min=numbers[i];
//            }
//        }
        System.out.println(min);

    }
}
