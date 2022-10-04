public class Worker implements IWorkable, IEatable, IPayable {
    @Override
    public void work() {
        System.out.println("Internal staff worked.");
    }

    @Override
    public void eat() {
        System.out.println("Internal staff ate.");
    }

    @Override
    public void pay() {
        System.out.println("Internal staff salaries were paid.");
    }
}
