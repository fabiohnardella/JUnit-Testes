package FontesAppCalculadora;

public class CalculadoraAritmetica {
	private int resultadoConta;
	
	public int somar(int numero1, int numero2) {
		resultadoConta = numero1 + numero2;
		return resultadoConta;
	}
	
	public int subtrair(int numero1, int numero2) {
		resultadoConta =  numero1 - numero2;
		return resultadoConta;
	}
	
	public int multiplicar(int numero1, int numero2) {
		resultadoConta = numero1 * numero2;
		return resultadoConta;
	}
	
	public int dividir(int numero1, int numero2) {
		resultadoConta =  numero1 / numero2;
		return resultadoConta;
	}
	
	
	
}
