package useArrays;

public class initilizeArray {
    public static void main(String[] args) {

//        int marks[] = {98,100,15,45,87,56}; // initialization of array by giving data
//
//        //  System.out.println(marks[8]); // exception index out of bounds
//        System.out.println("size of array: "+marks.length);
//        System.out.println("data of array :"+marks[1]);
//

        String names[] = {"Hari", "Sita", "Gita", "Ram"};
        // loop to iterate
        for (int i = 0; i <names.length ; i++) {
            System.out.println("name is : "+names[i]); // prints all declared data of array

        }
            // for each loop to iterate
        for(String name: names){
            System.out.println("for each : "+name); // this also prints all declared data
        }


    }
}
