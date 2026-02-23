public class Order {
    private double discountPercentage;
    private OrderItem[] orderItems;

    public Order(double discountPercentage, OrderItem[] orderItems) {
        setDiscountPercentage(discountPercentage);
        setOrderItems(orderItems);
    }

    public double calculateTotal() {
        double total = 0.0d;

        for (OrderItem orderItem : orderItems) {
            total += orderItem.getProduct().getNetPrice() * orderItem.getQuantity();
        }

        return total * (1.0d - this.discountPercentage / 100.0d);
    }

    public double getDiscountPercentage() {
        return this.discountPercentage;
    }

    public OrderItem[] getOrderItems() {
        return this.orderItems;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public void setOrderItems(OrderItem[] orderItems) {
        this.orderItems = orderItems;
    }
}