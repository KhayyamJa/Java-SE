package abstraction.onlinestore;

public class Main {
    public static void main(String[] args) {

        Product product = new ElectronicsProduct(135, "Smartphone", 1000, 3);
        product.displayDetails();

        Product product1 = new ClothingProduct(531, "T-Shirt", 55, "Medium");
        product1.displayDetails();
    }
}
