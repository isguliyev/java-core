public class Order {
    private double discountPercentage;
    private OrderItem[] orderItems;

    Order(double discountPercentage, OrderItem[] orderItems) {
        setDiscountPercentage(discountPercentage);
        setItems(orderItems);
    }

    public double calculateTotal() {
        double total = 0.0d;

        for (OrderItem OrderItem : orderItems) {
            total += OrderItem.getProduct().getNetPrice() * OrderItem.getQuantity();
        }

        return total * (1.0d - this.discountPercentage / 100.0d);
    }

    public double getDiscountPercentage() {
        return this.discountPercentage;
    }

    public OrderItem[] getItems() {
        return this.orderItems;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public void setItems(OrderItem[] orderItems) {
        this.orderItems = orderItems;
    }
}