package useArrays;

//creating array of objects

class Student{
    public int roll_no;
    public String std_name;
    // Constructor
    Student(int roll_no , String std_name){
        this.roll_no =roll_no;
        this.std_name =std_name;
    }
}
public class ArrayAsObj {
    public static void main(String[] args) {
        // declare array of student
        Student[] arr =new Student[]{new Student(1,"Ankit"),
                new Student(2,"Dipak"),new Student(3,"Krishna")};

       // classic way to declare
//        arr = new Student[3]; // allocate length of array
//        arr[0]=new Student(1,"Ankit");
//        arr[1]= new Student(2,"Dipak");
//        arr[2]=new Student(3,"Krishna");

        // for loop for displaying the array contents
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Roll no : "+arr[i].roll_no+" Name : "+arr[i].std_name);

        }
    }
}
