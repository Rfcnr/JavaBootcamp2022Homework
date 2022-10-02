public abstract class GameCalculator {

    //Every inheriting class has to override this method. Because the method is abstract.
    public abstract void calculate();


    public final void gameOver(){
        System.out.println("GAME OVER!");
    }
}
