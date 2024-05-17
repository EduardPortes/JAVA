package progstudo.orderstest.application;

import progstudo.orderstest.entities.Order;
import progstudo.orderstest.entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);




    }
}
