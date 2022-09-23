public class Main {
    public static void main(String[] args) {

        //DAY 2 - Value and Reference Types
        //What are the differences between the value type and the reference type?

        /*
            The value of primitive data types are directly stored in the memory.
            For example if int number is initialized to 22, then 22 is directly stored in the memory. (stack)

            Reference types on the other hand are a reference to values in the memory.
            Reference is in stack, value of reference is kept in heap.
            For example String text = "..."; creates a reference in the memory (stack)
            whatever the value "..." (heap) is stored and passes that memory reference (address) to the variable.
         */

        // Value type (primitive)
        int num1 = 10; //Pronunciation: The value of number1 is 10. (num1 = 10)
        int num2 = 20; //Pronunciation: The value of number2 is 20. (num2 = 20)

        num2 = num1; //Pronunciation: The value of number2 is equal to the value of number1. (num1 = 10 and num2 = 10)
        num1 = 30; // Pronunciation: The value of number1 is 30. (num1 = 30)

        System.out.println(num2); // (num1 = 30 and num2 = 10)

        // Reference Type (non-primitive)
        int[] numbers1 = new int[]{1, 2, 3};
        int[] numbers2  = new int[]{4, 5, 6};

        numbers2 = numbers1; //Pronunciation: the reference (address) of numbers2 is equal to the reference of numbers1.

        numbers1[0] = 10; //Pronunciation: The value in index 0 of the reference of numbers1 is equal to 10.

        System.out.println(numbers2[0]);
        // numbers1[0] and numbers2[0] are equal (10) because they have the same reference (address).
    }
}