public class Main {
    public static void main(String[] args) {

        //DAY 2 - Classes With Attributes

        Product product = new Product();
        product.id = 1;
        product.name = "Casper S500";
        product.description = "Laptop, İntel Core i7, 32G RAM, 500GB SSD, NVIDIA GeForce MX230, Silver";
        product.price = 15900;

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}