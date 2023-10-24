package br.com.fiap.model;

public class Endereco {

	private String cep;
	private String logradouro;
	private String bairro;

	
	//constructor methods
	public Endereco() {
		super();
	}

	public Endereco(String cep, String logradouro, String bairro) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.bairro = bairro;
	}

	//getters and setters
	public String getCep() {
		return cep;
		
	}

	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", logradouro=" + logradouro + ", bairro=" + bairro + "]";
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}
