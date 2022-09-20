public class Main {
    public static void main(String[] args) {

        //DAY 1 - Mini Project 5 - Find Number.

        int[] numbers = {1, 2, 5, 7, 9, 0};
        int searchedNumber = 9;
        boolean isThere = false;

        for (int number : numbers) {
            if(searchedNumber == number) {
                isThere = true;
                break;
            }
        }

        if(isThere) System.out.println("Number Found.");
        else System.out.println("Number Not Found.");
    }
}