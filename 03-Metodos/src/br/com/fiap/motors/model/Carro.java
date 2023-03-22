package br.com.fiap.motors.model;

public class Carro {

	//Atributos
	String modelo;
	
	int ano;
	
	double valor;
	
	//Metodos
	//idade calcularIdade(ano atual)
	public int calcularIdade(int anoAtual) {
		//Calcular a idade
		int idade = anoAtual - ano;
		//Retornar a idade
		return idade;
	}
	
	//aumentar o valor do carro 
	void atualizarValor(double porcentagem){
		valor *= (1 + porcentagem);

	}

	//Criar um metodo que calcula e retorna o valro do seguro do carro
	//Seguro do carro é baseado no valor, 5% do valor do carro
	public double calcularSeguro(double porcentagemSeguro){
		double seguro = (valor * porcentagemSeguro);
		return seguro;
	}

	public double calcularSeguro(){
		double seguro = valor * 0,05;
		return seguro;
	}

	//Criar um metodo que recebe a quantidade de parcelas, calcula e retorna
	//o valor da parcela do seguro 

	public double calcularParcelas(int numeroParcelas){
		double seguro = calcularSeguro();
		return seguro / numeroParcelas;
	
	}


}