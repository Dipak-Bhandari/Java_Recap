package useArrays;

public class twoDArray {
    public static void main(String[] args) {

        // initialization and allocation of 2-D Array
        int[][] arr={
                {1,2,5,4},
                {14,7,87,6},
                {44,9,3,45}
        };
        // nested for loop to print
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
