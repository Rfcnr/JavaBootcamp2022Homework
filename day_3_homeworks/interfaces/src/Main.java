public class Main {
    public static void main(String[] args) {

        //DAY 3 - Interfaces - Interfaces and Polymorphism

        /*
            Notes:
            * Interfaces are reference holders.
            * They are added to classes with the "implements" keyword. Not with "extends" !
                For example: public class MySqlCustomerDal implements ICustomerDal{...}
            * More than one interface can be implemented in classes.
                For example: public class MySqlCustomerDal implements ICustomerDal, IRepositoryDal{...}
         */

        CustomerManager customerManager = new CustomerManager(new SqlServerCustomerDal());
        customerManager.add();
    }
}