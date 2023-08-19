package abstraction.onlinestore;

public class ClothingProduct extends Product {
    private String size;

    public ClothingProduct(int productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    @Override
    public void displayDetails() {
        System.out.println("Product Id: " + getProductId()
                + " Name: " + getName()
                + " Price: " + getPrice() + " $" + " Size: " + size);
    }
}
