package com.DesafioComponentes;

import com.DesafioComponentes.Services.OrderService;
import com.DesafioComponentes.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.ls.LSOutput;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    public DesafioApplication(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DesafioApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Order order1 = new Order(1034, 150.00, 0.20);
        Order order2 = new Order(2282, 800.00, 0.10);
        Order order3 = new Order(1309, 95.90, 0);
        System.out.println("Pedido código: " + order1.getCode() +
                "\nValor Total: R$ " + String.format("%.2f", orderService.total(order1)));

        System.out.println("\nPedido código: " + order2.getCode() +
                "\nValor Total: R$ " + String.format("%.2f", orderService.total(order2)));

        System.out.println("\nPedido código: " + order3.getCode() +
                "\nValor Total: R$ " + String.format("%.2f", orderService.total(order3)));
    }
}
