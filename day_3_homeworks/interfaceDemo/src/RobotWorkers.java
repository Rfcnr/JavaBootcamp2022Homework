public class RobotWorkers implements IWorkable, IMaintainable{
    @Override
    public void work() {
        System.out.println("Robot staff worked.");
    }

    @Override
    public void maintenance() {
        System.out.println("Robot staff maintenance was done.");
    }
}
