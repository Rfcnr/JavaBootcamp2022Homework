public class Main {
    public static void main(String[] args) {

        String message = "The weather is very nice today.";
        System.out.println(message);

        System.out.println("Number of elements : " + message.length());
        System.out.println("Fifth element : " + message.charAt(4)); //Fifth element = fourth index (0-1-2-3-4)
        System.out.println(message.concat(" Perfect!") );
        System.out.println(message.startsWith("T")); //true
        System.out.println(message.startsWith("t")); //false
        System.out.println(message.endsWith(".")); //true
        System.out.println(message.endsWith("!")); //false

        char[] characters = new char[5];
        message.getChars(0,5,characters,0);
        System.out.println(characters);

        System.out.println(message.indexOf('a'));
        System.out.println(message.lastIndexOf('a'));

        String newMessage = message.replace(' ', '-');
        System.out.println(newMessage);

        System.out.println((message.substring(4,11)));

        for (String word : message.split(" ")){
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        String message2 = "    " + message + "    ";
        System.out.println("before trim: " + message2);
        System.out.println("after trim: " + message2.trim()); //If there are spaces at the beginning and end of the text, it will delete them.
    }
}