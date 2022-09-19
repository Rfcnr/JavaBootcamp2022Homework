public class Main {
    public static void main(String[] args) {

        //DAY 1 - Switch Demo

        char grade = 'D'; // A, B, C, D, F
        String outString; //Reusability: Write once, use many times.

        switch (grade){
            //value is checked.
            case 'A':
                // If the value is 'A' this block works.
                outString = "Perfect! You passed.";
                break;
            case 'B':
                // If the value is 'B' this block works.
                outString = "Very Good! You passed.";
                break;
            case 'C':
            case 'D':
                // If the value is 'C' OR 'D' this block works.
                outString = "Good! You passed.";
                break;
            case 'F':
                //If the value is 'F' this block works.
                outString = "It's bad! You could not pass!";
                break;
            default:
                //For this example, this block works if the value is not 'A', 'B', 'C', 'D' or 'F'.
                outString = "Invalid value.";
                break;
        }
        System.out.println(outString);
    }
}