public class Main {
    public static void main(String[] args) {

        //DAY 1 - Mini Project 4 - Friend Numbers

        int number_1 = 220;
        int sumOfFactors_1 = 1;

        int number_2 = 284;
        int sumOfFactors_2 = 1;

        int bigNumber = number_1;
        if (number_1 < number_2) {
            bigNumber = number_2;
        }

        if(bigNumber < 1){
            System.out.println(number_1 + " and " + number_2 + " are not friend numbers.");
        }
        else {
            for (int i = 2; i <= bigNumber / 2; i++) {

                //for number_1
                if(i <= number_1 / 2){
                    if(number_1 % i == 0) sumOfFactors_1 += i;
                }

                //for number_2
                if (i <= number_2 / 2) {
                    if(number_2 % i == 0) sumOfFactors_2 += i;
                }
            }

            if (number_1 == sumOfFactors_2 && number_2 == sumOfFactors_1) {
                System.out.println(number_1 + " and " + number_2 + " are friend numbers.");
            }
            else System.out.println(number_1 + " and " + number_2 + " are not friend numbers.");
        }
    }
}