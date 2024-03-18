package application;

import java.util.Date;

import entities.Orderex;
import entities.enums.OrderStatusex;

public class progamOrder {
    public static void main(String[] args) {
        Orderex order = new Orderex(1080, new Date(), OrderStatusex.PENDING_PAYMENT);
    
    
        System.out.println(order);

        OrderStatusex os1 = OrderStatusex.DELIVERED;
        OrderStatusex os2 = OrderStatusex.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
    
    


}
