package oop_;

// in java error occurs while
// Using class from different package with
// Private Modifier

    class Ease {
        private void display()
        {
            System.out.println("Cool Budd");
        }
    }

    // Class B
    class AccessModfiers {
        public static void main(String args[])
        {
            Ease obj = new Ease();
            // Trying to access private method of another class
            obj.display();
        }
    }


