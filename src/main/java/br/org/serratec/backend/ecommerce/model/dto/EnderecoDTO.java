package br.org.serratec.backend.ecommerce.model.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class EnderecoDTO {

	@NotNull
	@Size(min=4, max=60)
	private String rua;

	@NotNull
	@Size(min=1, max=20)
	private String numero;

	@Size(min=0, max=30)
	private String complemento;

	@Size(min=0, max=40)
	private String bairro;

	@NotNull
	@Size(min=3, max=40)
	private String cidade;

	@NotNull
	@Size(min=0, max=2)
	private String estado;

	@NotNull
	private String cep;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
}