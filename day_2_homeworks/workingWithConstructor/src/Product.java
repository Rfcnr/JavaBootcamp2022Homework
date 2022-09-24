public class Product {

    // The constructor method has the same name as the class.
    public Product(){
        System.out.println("The default constructor method worked.");
    }

    // The constructor method can be overloaded.
    public Product(int id, String name, String description, double price, int stockAmount){
        System.out.println("Overloaded constructor method worked for product id = " + id);
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
    }

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String productCode;

    // getter
    public int getId() {
        return id;
    }
    // setter
    public void setId(int id) {
        this.id = id;
    }

    // getter
    public String getName() {
        return name;
    }
    // setter
    public void setName(String name) {
        this.name = name;
    }

    // getter
    public String getDescription() {
        return description;
    }
    // setter
    public void setDescription(String description) {
        this.description = description;
    }

    // getter
    public double getPrice() {
        return price;
    }
    // setter
    public void setPrice(double price) {
        this.price = price;
    }

    // getter
    public int getStockAmount() {
        return stockAmount;
    }
    // setter
    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    // getter
    public String getProductCode() {
        productCode = name.charAt(0) + "-" + id;
        return productCode;
    }
}
