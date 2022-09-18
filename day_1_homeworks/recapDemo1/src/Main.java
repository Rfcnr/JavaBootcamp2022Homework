public class Main {
    public static void main(String[] args) {

        //DAY 1 - Recap Demo 1

        int num1 = 54;
        int num2 = 22;
        int num3 = 34;

        int maxNum = num1;

        if(maxNum < num2) { maxNum = num2; }

        if(maxNum < num3) { maxNum = num3; }

        System.out.println("The largest number is " + maxNum);
    }
}