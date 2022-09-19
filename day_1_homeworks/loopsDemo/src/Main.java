public class Main {
    public static void main(String[] args) {

        //DAY 1 - Loops Demo

        // For Loop
        for (int i = 2; i < 10; i += 2){
            // For this example, this block works if the value of i = 0, 1, 2, 3 or 4.
            System.out.println(i);
        }
        System.out.println("For Loop is over.");
        // While Loop; It works over and over again as long as the condition is met.
        //First the condition is checked, then the action is taken.
        //If the condition is not met, the inside of the loop block will not work.
        int i = 2;
        while (i < 10){
            System.out.println(i);
            i += 2; //For this example,
                    // if the value is not incremented each time,
                    // the program crashes due to the infinite loop.
        }
        System.out.println("While Loop is over.");


        //Do-While Loop
        //First the transaction is done, then the condition is checked.
        //The loop block runs at least once even if the condition is not met.
        int j = 2;
        do {
            System.out.println(j);
            j += 2;
        }while (j < 10);
        System.out.println("Do-While Loop is over.");
    }
}