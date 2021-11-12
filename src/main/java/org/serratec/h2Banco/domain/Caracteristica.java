package org.serratec.h2Banco.domain;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class Caracteristica {

	private String renavam;
	private String chassi;
	private Long ano;
	
	@Enumerated(EnumType.STRING)
	private Categoria categoria;
	
	
	private String cor;
	
	@Enumerated(EnumType.ORDINAL)
	private Combustivel combustivel;

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public Long getAno() {
		return ano;
	}

	public void setAno(Long ano) {
		this.ano = ano;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

	public Caracteristica(String renavam, String chassi, Long ano, Categoria categoria, String cor,
			Combustivel combustivel) {
		super();
		this.renavam = renavam;
		this.chassi = chassi;
		this.ano = ano;
		this.categoria = categoria;
		this.cor = cor;
		this.combustivel = combustivel;
	}

	public Caracteristica() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
