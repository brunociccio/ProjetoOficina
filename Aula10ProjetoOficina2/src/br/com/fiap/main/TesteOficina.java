package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereço;
import br.com.fiap.beans.Oficina;
import br.com.fiap.beans.ParteCarro;

public class TesteOficina {

	public static void main(String[] args) {
		// instanciar
		// Oficina(String nome, String cnpj, Endereço endereço, Colaborador colaborador, Carro carro)
		Oficina objOficina = new Oficina(JOptionPane.showInputDialog("Digite o nome da Oficina: "),
				JOptionPane.showInputDialog("Digite o CNPJ da Oficina: "));
		// Endereço(String cep, String logradouro, int número, String bairro, String cidade, String estado)
		Endereço objEndereço = new Endereço(JOptionPane.showInputDialog("Digite o CEP: "),
				JOptionPane.showInputDialog("Digite o logradouro: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número: ")),
				JOptionPane.showInputDialog("Digite o bairro: "),
				JOptionPane.showInputDialog("Digite a cidade: "),
				JOptionPane.showInputDialog("Digite o estado: "));
		// Colaborador(String nome, int idade, String cargo, String id)
		Colaborador objColaborador = new Colaborador(JOptionPane.showInputDialog("Digite o nome do colaborador: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do colaborador:  ")),
				JOptionPane.showInputDialog("Digite o cargo do colaborador: "),
				JOptionPane.showInputDialog("Digite o id do colaborador: "));
		// Carro(String marca, int ano, ParteCarro parteCarro)
		Carro objCarro = new Carro(JOptionPane.showInputDialog("Digite a marca do carro: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro: ")));
		// ParteCarro(String motor, String marca, int valor)
		ParteCarro objParteCarro = new ParteCarro(JOptionPane.showInputDialog("Digite o motor do carro: "),
				JOptionPane.showInputDialog("Digite a marca do motor: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do carro: ")));
		
		objOficina.setEndereço(objEndereço);
		objOficina.setColaborador(objColaborador);
		objOficina.setCarro(objCarro);
		
		objCarro.setParteCarro(objParteCarro);
		
		System.out.println("Nome da Oficina: " + objOficina.getNome() +
				"\nCNPJ da Oficina: " + objOficina.getCnpj() +
				"\nCEP da Oficina: " + objOficina.getEndereço().getCep() +
				"\nLogradouro da Oficina: " + objOficina.getEndereço().getLogradouro() + 
				"\nNúmero da Oficina: " + objOficina.getEndereço().getNúmero() +
				"\nNome do Colaborador: " + objOficina.getColaborador().getNome() +
				"\nID do Colaborador: " + objOficina.getColaborador().getId() + 
				"\nMarca do carro: " + objOficina.getCarro().getMarca() + 
				"\nAno do carro: " + objOficina.getCarro().getAno() + 
				"\nMotor do carro: " + objCarro.getParteCarro().getMotor() + 
				"\nMarca do motor: " + objCarro.getParteCarro().getMarca());
	}

}
