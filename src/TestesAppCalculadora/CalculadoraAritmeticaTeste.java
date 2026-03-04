package TestesAppCalculadora;

import static org.junit.Assert.*;

import org.junit.Test;

import FontesAppCalculadora.CalculadoraAritmetica;

public class CalculadoraAritmeticaTeste {

	private int resultadoReal;
	private int resultadoEsperado;
	
	@Test
	public void testeSomar2com3() {
		resultadoEsperado = 5;
		
		CalculadoraAritmetica calculadora = new CalculadoraAritmetica();
		resultadoReal = calculadora.somar(2, 3);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testeMultiplicar5com50() {
		resultadoEsperado = 250;
		
		CalculadoraAritmetica calculadora = new CalculadoraAritmetica();
		resultadoReal = calculadora.multiplicar(5, 50);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
