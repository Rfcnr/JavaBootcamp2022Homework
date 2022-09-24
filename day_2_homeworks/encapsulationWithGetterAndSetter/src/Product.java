public class Product {
    //Attributes related to the product.
    // It's called an attribute or field.
    //Variables that are not intended to be changed externally can be set as read-only.
    //For example, the productCode variable only has a getter method.

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
