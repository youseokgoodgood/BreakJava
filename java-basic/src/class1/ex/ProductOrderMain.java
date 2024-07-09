package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder order1 = new ProductOrder();
        order1.productName = "그래픽카드";
        order1.price = 390000;
        order1.quantity = 1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "메모리카드";
        order2.price = 30000;
        order2.quantity = 2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "cpu";
        order3.price = 400000;
        order3.quantity = 1;


        ProductOrder[] ProductOrders = {order1,order2,order3};

        int totalAmount = 0;

        for (ProductOrder order : ProductOrders) {
            System.out.println("productName = " + order.productName + " price = " + order.price + " quantity = " + order.quantity);
            totalAmount += order.price * order.quantity;
        }

        System.out.println("총 결제 금액:" + totalAmount);
    }
}
