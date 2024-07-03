package oops3;


public class learnInnerClass {

    //Non-static class within another class
    //it has access to members of outer class
    class Inner{

        int price;
        String text;
    }

    static class staticNested{
        String text2;
    }
    public static void main(String[] args) {

//        creating an object of non-static inner class
        //first way create object of outer class and then create object of non-static class
        learnInnerClass obj = new learnInnerClass();
        Inner inner  =obj. new Inner();

//        2nd way creating object of both classes at same time
//        Inner inner1 = new learnInnerClass(). new Inner();


//creating object of static nested class
        staticNested cc = new learnInnerClass.staticNested();

        inner.text= "Hello, non-static";
        cc.text2 ="Hello, static";
        System.out.println(inner.text);
        System.out.println(cc.text2);
    }
}
