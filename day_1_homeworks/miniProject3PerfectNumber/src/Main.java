public class Main {
    public static void main(String[] args) {

        //DAY 1 - Mini Project 3 - Perfect Number

        int number = 28;
        int sumOfFactors = 1;

        if(number <= 5){
            System.out.println(number + " is not a perfect number.");
        }
        else {
            for (int i = 2; i <= number / 2; i++){
                if(number % i == 0){
                    sumOfFactors += i;
                }
            }

            if(sumOfFactors == number){
                System.out.println(number + " is a perfect number.");
            }
            else System.out.println(number + " is not a perfect number.");
        }
    }
}