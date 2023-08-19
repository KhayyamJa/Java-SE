package abstraction.onlinestore;

public class ElectronicsProduct extends Product {
    private int warrantyPeriod;

    public ElectronicsProduct(int productId, String name, double price, int warrantyPeriod) {
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayDetails() {
        System.out.println("Product Id: " + getProductId()
                + " Name: " + getName()
                + " Price: " + getPrice() + " $" + " Warranty Period: " + warrantyPeriod + " years");
    }
}
