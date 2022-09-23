public class Main {
    public static void main(String[] args) {

        //DAY 2 - Methods 2

        String message = createAMessage();
        printTheMessage(message);

        String cityName = "Edirne";
        String message1 = "City Name: " + cityName + " , City Code: " + getCityCodeByCityName(cityName);
        printTheMessage(message1);

        int number1 = 22;
        int number2 = 54;
        String message2 = number1 + " + " + number2 + " = " + sumOfTwoNumbers(number1, number2);
        printTheMessage(message2);

    }

    public static void printTheMessage(String messageToPrint){
        System.out.println(messageToPrint);
        System.out.println("***** end of printing *****\n");
    }

    public static String createAMessage(){
        return "The weather is very nice today.";
    }

    public static int getCityCodeByCityName(String city){
        switch (city){
            case "Edirne":
                return 22;
            case "Sakarya":
                return 54;
            case "İstanbul":
                return 34;
            default:
                return 0;
        }
    }

    public static int sumOfTwoNumbers(int n1, int n2){
        return n1 + n2;
    }



}