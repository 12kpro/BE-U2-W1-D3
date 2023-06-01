package com.godfathers.pizza.entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.godfathers.pizza.utils.OrderState;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@ToString
@NoArgsConstructor

//@PropertySource("classpath:application.properties")
public class Order {
	private UUID orderNumber = UUID.randomUUID();
	private Double totalPrice;
	private OrderState state;
	private LocalDateTime dateTime = LocalDateTime.now();
	private List<Ordination> items;
	private Table tableRef;
	@Value("${seatprice}")
	String seatPrice;

	public Order(OrderState state, List<Ordination> items, Table tableRef) {
		this.state = state;
		this.items = items;
		this.tableRef = tableRef;
	}

	// @PostConstruct
	public void orderTotal() {
		//log.info(this.seatPrice);
		Double seatsPrice = this.tableRef.getSeats() * Double.parseDouble(this.seatPrice);

		double totalAmount = 0;
		for (Ordination ordination : this.items) {
			totalAmount += ordination.getTotalValue();
		}

		this.totalPrice = seatsPrice + totalAmount;
	}
}
