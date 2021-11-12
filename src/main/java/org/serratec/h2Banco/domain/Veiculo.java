package org.serratec.h2Banco.domain;


import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "veiculo", schema = "public")
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Digite a placa")
	@Size(max=7)
	@Column(name = "placa", length = 7, nullable = false)
	private String placa;
	
	@NotBlank(message="Digite a marca")
	@Size(max=15)
	@Column(name = "marca", length = 15,  nullable = false)
	private String marca;
	
	@NotBlank(message="Digite o modelo")
	@Size(max=40)
	@Column(name = "modelo", length = 40, nullable = true)
	private String modelo;
	
	@Embedded
	private Caracteristica caracteristica;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Caracteristica getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(Caracteristica caracteristica) {
		this.caracteristica = caracteristica;
	} 
		
	
}
	
