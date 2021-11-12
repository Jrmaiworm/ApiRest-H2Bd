package org.serratec.h2Banco.domain;

import org.springframework.beans.factory.support.BeanDefinitionValidationException;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Categoria {
HATCH ,SEDAN , PICAPE,
SUV,CONVERSIVEL,MINIVAN;
	
	@JsonCreator
	public static Categoria verifica(String value)throws BeanDefinitionValidationException{
		for(Categoria c: values()) {
			if(value.equals(c.name())) {
				return c;
			}
		}
		throw new BeanDefinitionValidationException("Categoria preenchida incorretamente");
	}


}
