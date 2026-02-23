public class Order {
    private double discountPercentage;
    private OrderItem[] orderItems;

    public Order(double discountPercentage, OrderItem[] orderItems) {
        setDiscountPercentage(discountPercentage);
        setOrderItems(orderItems);
    }

    public void presentOrderSummary() {
        double total = 0.0d;

        System.out.println("------- ORDER SUMMARY -------");

        for (OrderItem orderItem: orderItems) {
            System.out.printf(
                "Type: %s Title: %s  Price: %.2f  Quant: %d  Total: %.2f\n",
                orderItem.getProduct().getClass().getSimpleName(),
                orderItem.getProduct().getTitle(),
                orderItem.getProduct().getNetPrice(),
                orderItem.getQuantity(),
                orderItem.getProduct().getNetPrice() * orderItem.getQuantity()
            );

            total += orderItem.getProduct().getNetPrice() * orderItem.getQuantity();
        }

        System.out.println("----------------------------");
        System.out.printf(
            "DISCOUNT: %.2f\n",
            total * this.discountPercentage / 100.0d
        );
        System.out.printf("TOTAL PRODUCTS: %.2f\n", total);
        System.out.println("----------------------------");
        System.out.printf(
            "TOTAL ORDER: %.2f\n",
            total * (1.0d - this.discountPercentage / 100.0d)
        );
        System.out.println("----------------------------");
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