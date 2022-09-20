public class Main {
    public static void main(String[] args) {

        //DAY 1 - Mini Project 2 - Vowels (Turkish alphabet)

        char letter = 'E';

        // If Solution
        String vowels = "AIOUaıouEİÖÜeiöü";
        int letterIndex = vowels.indexOf(letter);

        if(letterIndex < 0){
            System.out.println("'" + letter + "'" + " is not a vowel.");
        }
        else if (letterIndex < 8) {
            System.out.println("'" + letter + "'" + " is a bold vowel.");
        }
        else  {
            System.out.println("'" + letter + "'" + " is a thin vowel.");
        }

        System.out.println("****************************");

        //Switch Solution
        switch (letter) {
            case 'A': case 'a':
            case 'I': case 'ı':
            case 'O': case 'o':
            case 'U': case 'u':
                System.out.println("'" + letter + "'" + " is a bold vowel.");
                break;
            case 'E': case 'e':
            case 'İ': case 'i':
            case 'Ö': case 'ö':
            case 'Ü': case 'ü':
                System.out.println("'" + letter + "'" + " is a thin vowel.");
                break;
            default:
                System.out.println("'" + letter + "'" + " is not a vowel.");
        }


    }
}