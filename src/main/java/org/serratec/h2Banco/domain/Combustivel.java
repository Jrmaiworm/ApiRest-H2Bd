package org.serratec.h2Banco.domain;

import org.springframework.beans.factory.support.BeanDefinitionValidationException;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Combustivel {

	
	ALCOOL(1,"Alcool"), GASOLINA(2,"Gasolina"), DIESEL(3,"Diesel"),FLEX(4,"Flex");

	
	private Integer codigo;
	private String tipo; 
	
	
	private Combustivel(Integer codigo, String tipo) {
		this.codigo=codigo;
		this.tipo=tipo;
	}
	
	public Integer getCodigo() {
		return codigo;
		
	}
	public String getTipo() {
		return tipo;
		
	}
	
	@JsonCreator
	public static Combustivel verifica(String value)throws BeanDefinitionValidationException{
		for(Combustivel c: values()) {
			if(value.equals(c.name())) {
				return c;
			}
		}
		throw new BeanDefinitionValidationException("Categoria preenchida incorretamente");
	}
	
}
