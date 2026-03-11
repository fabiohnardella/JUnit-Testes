package FontesAppCalculadora;

public class CalculadoraIMC {
	
	private double imcCalculado;
	private double alturaAoQuadrado;

	public double calculaImc(double peso, double altura) {
		Calculadora calc = new Calculadora();
		alturaAoQuadrado = calc.multiplicar(altura, altura);
		
		imcCalculado = calc.dividir(peso, alturaAoQuadrado);
		
		return imcCalculado;
		
		
	}

}
