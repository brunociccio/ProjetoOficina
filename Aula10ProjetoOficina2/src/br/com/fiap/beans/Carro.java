package br.com.fiap.beans;

public class Carro {
	// variáveis
	private String marca;
	private int ano;
	private ParteCarro parteCarro;
	// vazio
	public Carro() {
		super();
	}
	// cheio
	public Carro(String marca, int ano, ParteCarro parteCarro) {
		super();
		this.marca = marca;
		this.ano = ano;
		this.parteCarro = parteCarro;
	}
	// parcial
	public Carro(String marca, int ano) {
		super();
		this.marca = marca;
		this.ano = ano;
	}
	// setters and getters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public ParteCarro getParteCarro() {
		return parteCarro;
	}
	public void setParteCarro(ParteCarro parteCarro) {
		this.parteCarro = parteCarro;
	}
}
