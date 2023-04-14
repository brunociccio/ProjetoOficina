package br.com.fiap.beans;

public class ParteCarro {
	// variáveis
	private String motor;
	private String marca;
	private int valor;
	// vazio
	public ParteCarro() {
		super();
	}
	// cheio
	public ParteCarro(String motor, String marca, int valor) {
		super();
		this.motor = motor;
		this.marca = marca;
		this.valor = valor;
	}
	// setters and getters
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}

}
