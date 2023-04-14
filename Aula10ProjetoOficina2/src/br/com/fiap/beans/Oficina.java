package br.com.fiap.beans;

public class Oficina {
	// variáveis
	private String nome;
	private String cnpj;
	private Endereço endereço;
	private Colaborador colaborador;
	private Carro carro;
	// vazio
	public Oficina() {
		super();
	}
	// cheio
	public Oficina(String nome, String cnpj, Endereço endereço, Colaborador colaborador, Carro carro) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereço = endereço;
		this.colaborador = colaborador;
		this.carro = carro;
	}
	// com atributos da própria classe
	public Oficina(String nome, String cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
	}
	// setters and getters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Endereço getEndereço() {
		return endereço;
	}
	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
	}
	public Colaborador getColaborador() {
		return colaborador;
	}
	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
}
	
	