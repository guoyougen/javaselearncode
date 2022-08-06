package com.se.day9;

import java.util.Date;
import java.util.Objects;

/**
 * @projectname: learn
 * @packname: com.se.day9
 * @classname: Order
 * @author: gyg
 * @date: 2022/7/19 上午 9:53
 * @version: 1.0
 * @description: TODO
 */

public class Order {
    private long id;
    private static long increase=99l;
    private String orderNumber;
    private double cost;
    private Date orderDate;
    private Date shipmentDate;
    private boolean orderState;
    private Customer customer;

    public Order(double cost, Date orderDate, Date shipmentDate, boolean orderState, Customer customer) {
        this.id = increase++;
        orderNumber=OrderNoGenerator.generateNo();
        this.cost = cost;
        this.orderDate = orderDate;
        this.shipmentDate = shipmentDate;
        this.orderState = orderState;
        this.customer = customer;
    }
    public Order(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Double.compare(order.cost, cost) == 0 && orderState == order.orderState && Objects.equals(orderNumber, order.orderNumber) && Objects.equals(orderDate, order.orderDate) && Objects.equals(shipmentDate, order.shipmentDate) && Objects.equals(customer, order.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderNumber, cost, orderDate, shipmentDate, orderState, customer);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", cost=" + cost +
                ", orderDate=" + orderDate +
                ", shipmentDate=" + shipmentDate +
                ", orderState=" + orderState +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static long getIncrease() {
        return increase;
    }

    public static void setIncrease(long increase) {
        Order.increase = increase;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(Date shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public boolean isOrderState() {
        return orderState;
    }

    public void setOrderState(boolean orderState) {
        this.orderState = orderState;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
