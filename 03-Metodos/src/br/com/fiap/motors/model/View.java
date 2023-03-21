package br.com.fiap.motors.model;

public class View {

	//main -> CTRL + espaco
	public static void main(String[] args) {
		//Instanciar o Carro
		Carro gol = new Carro();
		
		//Colocar informacoes nos atributos
		gol.ano = 1999;
		gol.modelo = "Gol Bola";
		gol.valor = 15000;
		
		
		//Calcular a idade do carro
		int i = gol.calcularIdade(2023);
		
		//Exibir a idade
		System.out.println("Idade do carro: " + i);

		//aumentar o valor do carro em 20%
		gol.atualizarValor(0.2);

		//exibir o valor do carro 
		System.out.println("Valor do carro: " + gol.valor);

		//Exibir o valor do seguro de acordo com o valor do carro
		double seguro = gol.calcularSeguro();
		System.out.println("Valor do Seguro: " + seguro);
		
		//Exibir o valor da parcela do seguro em 3x
		double parcela = gol.calcularParcelas(30);
		System.out.println("O valor da parcela do seguro (3x); "da+ parcela)
}