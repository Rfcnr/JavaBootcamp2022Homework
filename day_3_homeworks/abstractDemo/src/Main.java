public class Main {
    public static void main(String[] args) {

        //DAY 3 - Abstract Demo

        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new MySqlDatabaseManager();

        customerManager.getCustomers();
    }
}