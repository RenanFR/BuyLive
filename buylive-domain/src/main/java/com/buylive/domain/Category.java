package com.buylive.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class Category {

	private Long id;
	
	private String name;
	
	@JsonBackReference
	private List<Product> products;
	
}
