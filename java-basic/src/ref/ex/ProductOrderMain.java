package ref.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder( "그래픽카드",390000,1);
        orders[1] = createOrder( "메모리카드",30000,2);
        orders[2] = createOrder( "cpu",400000,1);

        printOrders(orders);

    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        int totalAmount = 0;

        for (ProductOrder order : orders) {
            System.out.println("productName = " + order.productName + " price = " + order.price + " quantity = " + order.quantity);
            totalAmount += order.price * order.quantity;
        }

        System.out.println("총 결제 금액:" + totalAmount);

    }
}
