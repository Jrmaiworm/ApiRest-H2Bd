package org.serratec.h2Banco.exception;

import java.time.LocalDateTime;
import java.util.List;

public class ErroResposta{
	 private Integer status;
	 private String titulo;
	 private LocalDateTime datahora;
	 private List<String> errors;
	public ErroResposta(Integer status, String titulo, LocalDateTime datahora, List<String> errors) {
		super();
		this.status = status;
		this.titulo = titulo;
		this.datahora = datahora;
		this.errors = errors;



}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public LocalDateTime getDatahora() {
		return datahora;
	}
	public void setDatahora(LocalDateTime datahora) {
		this.datahora = datahora;
	}
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
}