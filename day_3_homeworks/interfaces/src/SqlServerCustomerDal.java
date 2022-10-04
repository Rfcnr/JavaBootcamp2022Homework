public class SqlServerCustomerDal implements ICustomerDal{
    // Dal: Data Access Layer.
    @Override
    public void add() {
        System.out.println("Added to SqlServer.");
    }
}
