import products.Product;

public class OrderItem {
    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity) {
        setProduct(product);
        setQuantity(quantity);
    }

    public Product getProduct() {
        return this.product;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}