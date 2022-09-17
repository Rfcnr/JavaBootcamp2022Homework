public class Main {
    public static void main(String[] args) {

        // DAY 1 - Data Types

        /* Notes:
            Java is a type safe language.

	        Java Data Types
            There 2 Types Of Data Types In Java
            1) Primitive -> byte, char, short, int, long, float, double and boolean.
            2) Non-primitive -> (All Classes) -> String, Arrays etc.

            TYPE	| SIZE	    | DESCRIPTION
            byte	| 1 byte	| whole numbers from -128 to 127
            short	| 2 bytes	| -32,768 to 32,767
            int	    | 4 bytes	| -2,147,483,648 to 2,147,483,647
            long	| 8 bytes	| -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            float	| 4 bytes	| Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
            double	| 8 bytes	| Stores fractional numbers. Sufficient for storing 15 decimal digits
            boolean	| 1 bit	    | true or false values
            char	| 2 bytes	| single character/letter or ASCII values

            source link: https://www.w3schools.com/java/java_data_types.asp
        */

        //Default values:
        byte v1 = 0;
        short v2 = 0;
        int v3 = 0;
        long v4 = 0L;
        float v5 = 0.0f;
        double v6 = 0.0d;
        char v7 = '\u0000'; //The minimum value char can hold is ‘u0000‘ which is a Unicode value denoting ‘null‘ or 0 in decimal.
        boolean v9 = false;


    }
}