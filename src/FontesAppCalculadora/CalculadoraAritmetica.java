package FontesAppCalculadora;

public class CalculadoraAritmetica {
	private double resultadoConta;
	
	public double somar(double numero1, double numero2) {
		resultadoConta = numero1 + numero2;
		return resultadoConta;
	}
	
	public double subtrair(double numero1, double numero2) {
		resultadoConta =  numero1 - numero2;
		return resultadoConta;
	}
	
	public double multiplicar(double numero1, double numero2) {
		resultadoConta = numero1 * numero2;
		return resultadoConta;
	}
	
	public double dividir(double numero1, double numero2) {
		resultadoConta =  numero1 / numero2;
		return resultadoConta;
	}
	

	
	
}
