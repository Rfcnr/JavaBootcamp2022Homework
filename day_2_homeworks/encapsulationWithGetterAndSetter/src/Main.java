public class Main {
    public static void main(String[] args) {

        //DAY 2 - Encapsulation With Getter and Setter

        Product product = new Product();
        product.setId(1);
        product.setName("Casper S500");
        product.setDescription("Laptop, İntel Core i7, 32G RAM, 500GB SSD, NVIDIA GeForce MX230, Silver");
        product.setPrice(15900);
        product.setStockAmount(5);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println("Product Code : " + product.getProductCode());
    }
}