public class Main {
    public static void main(String[] args) {

        //DAY 2 - Methods
        //DRY : Don't Repeat Yourself!
        //Method names must be written in camelcase in Java.

        findNumber();
    }

    public static void findNumber(){
        int[] numbers = {1, 2, 5, 7, 9, 0};
        int searchedNumber = 22;
        boolean isThere = false;

        for (int number : numbers) {
            if(searchedNumber == number) {
                isThere = true;
                break;
            }
        }

        if(isThere) resultMessage("Number Found : " + searchedNumber);
        else resultMessage("Number Not Found : " + searchedNumber);
    }

    public  static void resultMessage(String message){
        System.out.println(message);
    }
}