public class Main {
    public static void main(String[] args) {

        // DAY 2 - Method Overloading
        FourOperations fourOperations = new FourOperations();

        int total1 = fourOperations.summation(2,4);         //Same method that takes two parameters.
        int total2 = fourOperations.summation(2,4,22,54);   //Same method that takes four parameters.

        System.out.println("total1 = " + total1);
        System.out.println("total2 = " + total2);
    }
}