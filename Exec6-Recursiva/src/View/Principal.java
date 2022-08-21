package View;

import Controller.SomaFatorialController;

public class Principal {

	public static void main(String[] args) {
		SomaFatorialController soma = new SomaFatorialController();
		
		double num = 2;
		double resultado = soma.somaFracao(num);
		System.out.println(resultado);
	}
	

}
