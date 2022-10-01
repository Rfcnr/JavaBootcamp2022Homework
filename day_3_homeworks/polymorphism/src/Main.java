public class Main {
    public static void main(String[] args) {

        //DAY 3 - Polymorphism
        /*
        Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
        Inheritance lets us inherit attributes and methods from another class.
        Polymorphism uses those methods to perform different tasks.
        This allows us to perform a single action in different ways.
         */

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        CustomerManager customerManager1 = new CustomerManager(new FileLogger());
        CustomerManager customerManager2 = new CustomerManager(new EmailLogger());
        customerManager.add();
        customerManager1.add();
        customerManager2.add();

    }
}