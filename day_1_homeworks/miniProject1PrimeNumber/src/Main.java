public class Main {
    public static void main(String[] args) {

        int number = 54; // Is number prime?

        //switch - if solution
        switch (number % 2)
        {
            case 0:
                if(number == 2){
                    System.out.println("Number is prime.");
                }
                else System.out.println("Number is not prime.");
                break;
            default:
                if(number <= 1){
                    System.out.println("Number is not prime.");
                }
                else System.out.println("Number is prime.");
                break;
        }


        // if - else if - else solution
        if (number <= 1){
            System.out.println("Number is not prime.");
        }
        else if(number == 2){
            System.out.println("Number is prime.");
        }
        else {
            if(number % 2 == 0){
                System.out.println("Number is not prime.");
            }
            else System.out.println("Number is prime.");
        }
    }
}