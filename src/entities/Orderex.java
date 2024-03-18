package entities;

import java.util.Date;

import entities.enums.OrderStatusex;

public class Orderex {
    private Integer id;
    private Date moment;
    private OrderStatusex status;
    
    public Orderex(){
    }
    
    public Orderex(Integer id, Date moment, OrderStatusex status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatusex getStatus() {
        return status;
    }

    public void setStatus(OrderStatusex status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
    }
    






}
