public class Main {
    public static void main(String[] args) {

        // DAY 2 - Working With Variable Arguments

        // The sum of the two numbers
        int sum1 = sumOfTwoNumbers(5, 17);
        printTheMessage("The sum of the two numbers: " + sum1);

        //The sum of the entered numbers
        int sum2 = sumTheEnteredNumbers(5, 7, 22, 34, 54);
        printTheMessage("The sum of the entered numbers: " + sum2);
    }

    public static int sumOfTwoNumbers(int n1, int n2){
        return n1 + n2;
    }

    public static int sumTheEnteredNumbers(int... numbers){
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }

    public static void printTheMessage(String messageToPrint){
        System.out.println(messageToPrint);
        System.out.println("***** end of printing *****\n");
    }
}