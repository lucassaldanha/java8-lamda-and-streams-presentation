package com.lsoftware.streams;

import java.util.Arrays;
import java.util.List;

public class BasicStreamExample {

    public static void main(String[] args) {
        List<Order> orders = getOrders();

        int totalOnlineOrders = orders.stream()
                .filter(o -> o.getType() == OrderType.ONLINE)
                .mapToInt(Order::getQuantity)
                .sum();

        System.out.println("Total ONLINE orders = " + totalOnlineOrders);
    }

    public static List<Order> getOrders() {
        return Arrays.asList(
                new Order(OrderType.ONLINE, 3),
                new Order(OrderType.STORE, 2),
                new Order(OrderType.ONLINE, 1));
    }

    public static class Order {
        private OrderType type;
        private Integer quantity;

        public Order(OrderType type, Integer quantity) {
            this.type = type;
            this.quantity = quantity;
        }

        public OrderType getType() {
            return type;
        }

        public Integer getQuantity() {
            return quantity;
        }
    }

    public enum OrderType {
        STORE, ONLINE
    }

}
