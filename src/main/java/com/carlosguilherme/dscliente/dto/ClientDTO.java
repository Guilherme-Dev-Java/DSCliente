package com.carlosguilherme.dscliente.dto;

import java.time.LocalDate;

import com.carlosguilherme.dscliente.entities.Client;

public class ClientDTO {

	private Long id;
	private String name;
	private String cpf;
	private Double income;
	private LocalDate brithDate;
	private Integer children;
	
	public ClientDTO(Long id, String name, String cpf, Double income, LocalDate brithDate, Integer children) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.brithDate = brithDate;
		this.children = children;
	}
	
	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		income = entity.getIncome();
		brithDate = entity.getBrithDate();
		children = entity.getChildren();
		
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getIncome() {
		return income;
	}

	public LocalDate getBrithDate() {
		return brithDate;
	}

	public Integer getChildren() {
		return children;
	}

	
	
	
}
