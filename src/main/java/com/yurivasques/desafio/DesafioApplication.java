package com.yurivasques.desafio;

import com.yurivasques.desafio.entities.OrderService;
import com.yurivasques.desafio.services.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {

		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Serão usados três exemplos para teste do desafio

		Order order1 = new Order(1034, 150.0, 20.0);
		Order order2 = new Order(2282, 800.0, 10.0);
		Order order3 = new Order(1309, 95.90, 0.0);

		double orderResult1 = orderService.total(order1);
		double orderResult2 = orderService.total(order2);
		double orderResult3 = orderService.total(order3);

		// no caso da ultima linha de cada 3 print mudamos para .printf para poder ajustar o número de casas decimais.
		System.out.println("\n---*Pedido 01*---");
		System.out.println(" Pedido Código: " + order1.getCode());
		System.out.printf("Total do Pedido: R$ %.2f%n", orderResult1);

		System.out.println("\n---*Pedido 02*---");
		System.out.println(" Pedido Código: " + order2.getCode());
		System.out.printf("Total do Pedido: R$ %.2f%n", orderResult2);

		System.out.println("\n---*Pedido 03*---");
		System.out.println(" Pedido Código: " + order3.getCode());
		System.out.printf("Total do Pedido: R$ %.2f%n ", orderResult3);



	}
}
