public class Main {
    public static void main(String[] args) {

        //DAY 1 - Recap Demo 2
        double[] myList = {1.2, 6.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            total += number;

            if (max < number) max = number;
        }
        System.out.println("Total : " + total);
        System.out.println("Max value : " + max);
    }
}