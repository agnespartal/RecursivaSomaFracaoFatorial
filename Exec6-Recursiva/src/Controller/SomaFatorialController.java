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
			double fat = fatorial(num);
			soma = soma + (1/fat);
			return soma + somaFracao(num - 1);
		}
	}
	
	public double fatorial (double num) {
		if ( num <= 1) {
			return 1;
		} else
			return num * fatorial(num - 1);
	}
}
