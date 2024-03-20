package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private OrderItem item;
    private Client client;
            
    private List<OrderItem> items = new ArrayList<>();
    public Order(){}
    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    

    public Date getMoment() {
        return moment;
    }



    public void setMoment(Date moment) {
        this.moment = moment;
    }



    public OrderStatus getStatus() {
        return status;
    }



    public void setStatus(OrderStatus status) {
        this.status = status;
    }



    public OrderItem getItem() {
        return item;
    }



    public void setItem(OrderItem item) {
        this.item = item;
    }

    public Client getClient(){
        return client;
    }
    public void setClient(Client client){
        this.client = client;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double total(){
        Double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    
    public String toString(){
        StringBuilder sb = new StringBuilder();
      
        sb.append("Order Summary: " + "\n");
        sb.append("Order Momment: " + sdf2.format(moment) + "\n");
        sb.append("Order Status: " + status + "\n");
        sb.append("Client: " + client.getName()+" "+ "("+ sdf.format(client.getBirthdate())+")" + " - " + client.getEmail() + "\n");
        sb.append("Order Items: " + "\n");
        for (OrderItem item : items) {
            sb.append( "\n" +item.getProduct().getName() + ", " + "Quantity: " + item.getQuantity() + ", " + "SubTotal: " + item.subTotal() + "\n");
        }
        sb.append("Total: " + total());
        return sb.toString();
    
  
    }

}
