package com.orderservice.dto;

import java.math.BigDecimal;

import com.orderservice.model.OrderLineItems;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemsDto {

	private String skuCode;
	private BigDecimal price;
	private Integer quantity;
}
