public class Main {
    public static void main(String[] args) {

        // DAY 2 - Classes - What is the class? - How does a class work?

        // Class names are written PascalCase
        // Classes are of REFERENCE TYPE. (Non-primitive)

        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();

        customerManager = customerManager2;
        customerManager.add();
        customerManager.remove();
        customerManager.update();

        /*
            Java Data Types
            There 2 Types Of Data Types In Java
            1) Primitive -> byte, char, short, int, long, float, double and boolean.
            2) Non-primitive -> (All Classes) -> String, Arrays etc.
         */
    }
}