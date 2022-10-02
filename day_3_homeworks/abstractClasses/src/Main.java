public class Main {
    public static void main(String[] args) {

        //DAY 3 - Abstract Classes
        /*
            Rules:
            * Abstract classes must have an abstract signature.
            For example: public abstract class GameCalculator {...}

            * Abstract methods must have an abstract signature, and the method does not have a body.
            For example: public abstract void calculate();

            * Abstract classes do not have to have abstract methods.

            * Abstract classes cannot be initialized with the new keyword alone.
            For example: GameCalculator gameCalculator = new GameCalculator(); // ERROR!

            Used as it is, it works, but is NOT RECOMMENDED.
            GameCalculator gameCalculator = new GameCalculator()
            {
                @Override
                public void calculate() {...}
            };

            The recommended usage is to initialize the inheriting class with the new keyword.
            For example: GameCalculator gameCalculator = new WomanCalculator();
         */

        GameCalculator[] calculators = {new WomanGameCalculator(), new ManGameCalculator(), new KidsGameCalculator()};

        for (GameCalculator calculator : calculators){
            calculator.calculate();
        }
    }
}