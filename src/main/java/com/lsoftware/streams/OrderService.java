package com.lsoftware.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class OrderService {

    public static void main(String[] args) {
        Stream<Order> orderStream = OrderService.stream();

        OptionalDouble average = orderStream
                .filter(o -> o.getItems().size() >= 2)
                .mapToDouble(Order::getTotal)
                .average();

        System.out.println("Average of orders with more than 2 items: " + average.getAsDouble());
    }

    private static Stream<Order> stream() {
        return Arrays.asList(
                new Order(Arrays.asList(new Item(10.0))),
                new Order(Arrays.asList(new Item(10.0), new Item(10.0))),
                new Order(Arrays.asList(new Item(10.0), new Item(10.0), new Item(10.0))))
                .stream();
    }

    public static class Order {
        private List<Item> items;

        public Order(List<Item> items) {
            this.items = items;
        }

        public List<Item> getItems() {
            return items;
        }

        public double getTotal() {
            return items.stream().mapToDouble(Item::getValue).sum();
        }
    }
    public static class Item {

        private double value;

        public Item(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }
    }

}
