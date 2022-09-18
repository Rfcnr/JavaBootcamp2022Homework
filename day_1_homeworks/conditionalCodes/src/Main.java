public class Main {
    public static void main(String[] args) {

        // DAY 1 - Conditional Codes - If Blocks.

        int value = 22;

        if(value < 20){
            //If the value is less than 20, this block works.
            System.out.println("The value is less than 20");
        }
        else if(value == 20){
            //If the value is equal to 20, this block works.
            System.out.println("The value is equal to 20");
        }
        else{
            //If the value is not less than or equal to 20, this block will work.
            //In this example, this block works because the value is greater than 20.
            System.out.println("The value is greater than 20");
        }
    }
}