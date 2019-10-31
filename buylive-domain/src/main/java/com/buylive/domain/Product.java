package com.buylive.domain;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class Product {

	private Long id;
	
	private String description;
	
	private BigDecimal price;
	
	@JsonManagedReference
	private Category category;
	
	@JsonManagedReference
	private Salesman salesman;
	
	
}
