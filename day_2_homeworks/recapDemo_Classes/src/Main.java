public class Main {
    public static void main(String[] args) {

        // DAY 2 - Recap Demo - Classes

        FourOperations fourOperations = new FourOperations();

        printTheMessage("50 + 10 = " + fourOperations.summation(50, 10));
        printTheMessage("50 - 10 = " + fourOperations.subtraction(50, 10));
        printTheMessage("50 * 10 = " + fourOperations.multiplication(50, 10));
        printTheMessage("50 / 10 = " + fourOperations.division(50, 10));

    }

    public static void printTheMessage(String messageToPrint){
        System.out.println(messageToPrint);
        System.out.println("***** end of printing *****\n");
    }
}