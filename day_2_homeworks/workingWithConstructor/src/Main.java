public class Main {
    public static void main(String[] args) {

        //DAY 2 - Working With Constructor

        // With defaulth constructor.
        Product product = new Product(); // Product() is a default constructor.
        product.setId(1);
        product.setName("Casper S500");
        product.setDescription("Laptop, İntel Core i7, 32G RAM, 500GB SSD, NVIDIA GeForce MX230, Silver");
        product.setPrice(15900);
        product.setStockAmount(5);

        // With overloaded constructor.
        Product product1 = new Product(2, "Asus KJ52", "Asus Laptop", 8500, 3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        productManager.Add(product1);

        System.out.println("Product Code : " + product.getProductCode());
        System.out.println("Product1 Code : " + product1.getProductCode());
    }
}