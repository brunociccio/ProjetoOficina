package br.com.fiap.beans;

public class Colaborador {
	// variáveis
	private String nome;
	private int idade;
	private String cargo;
	private String id;
	// vazio
	public Colaborador() {
		super();
	}
	// cheio
	public Colaborador(String nome, int idade, String cargo, String id) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.id = id;
	}
	// setters and getters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
