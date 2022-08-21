package Controller;

public class SomaFatorialController {

	public SomaFatorialController() {
		super();
	}

	public double somaFracao (double num) {
		double soma = 0;
		if (num == 1) {
			return 1;
		} else {
			double fat = fatorial(num); //chama a função para calcular o fatorial 
			soma = soma + (1/fat); 
			return soma + somaFracao(num - 1);
			//faz a fração de 1 sobre o fatorial, utilizando a chamada da função para o calculo do fatorial, e decai em 1 a cada chamada. 
		}
	}
	
	public double fatorial (double num) {
		//condição de parada quando o valor inicial for igual a 1
		if ( num <= 1) {
			return 1;
		} else
			return num * fatorial(num - 1);
			//multiplica o valor inicial com ele mesmo menos 1 até chegar na condição de parada
	}
}
