package com.lsoftware.streams;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NotSoBasicStreamExample {

    public static void main(String[] args) {
        System.out.println("Old way:");
        oldOnlineOrdersMap();
        System.out.println("--------------");
        System.out.println("Stream way:");
        streamOnlineOrdersMap();
    }

    public static void oldOnlineOrdersMap() {
        Map<Integer, Integer> map = new HashMap<>();

        for (Order order : getOrders()) {
            if(!map.containsKey(order.getUserId())) {
                map.put(order.getUserId(), 0);
            }

            if(order.getType() == OrderType.ONLINE) {
                int total = map.get(order.getUserId());
                total += order.getQuantity();
                map.put(order.getUserId(), total);
            }
        }

        for (Integer u : map.keySet()) {
            System.out.println("User " + u + " has " + map.get(u) + " online orders");
        }
    }

    public static void streamOnlineOrdersMap() {
        getOrders().stream()
                .filter(o -> o.getType() == OrderType.ONLINE)
                .collect(
                        Collectors.groupingBy(Order::getUserId, Collectors.summingInt(Order::getQuantity)))
                .forEach((u, t) -> System.out.println("User " + u + " has " + t + " online orders"));
    }

    public static List<Order> getOrders() {
        return Arrays.asList(
                new Order(OrderType.ONLINE, 3, 1),
                new Order(OrderType.ONLINE, 3, 1),
                new Order(OrderType.ONLINE, 2, 2),
                new Order(OrderType.STORE, 2, 1),
                new Order(OrderType.STORE, 5, 2));
    }

    public static class Order {
        private OrderType type;
        private Integer quantity;
        private Integer userId;

        public Order(OrderType type, Integer quantity, Integer userId) {
            this.type = type;
            this.quantity = quantity;
            this.userId = userId;
        }

        public OrderType getType() {
            return type;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public Integer getUserId() {
            return userId;
        }
    }

    public enum OrderType {
        STORE, ONLINE
    }

}
