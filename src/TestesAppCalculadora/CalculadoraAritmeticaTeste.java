package TestesAppCalculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import FontesAppCalculadora.CalculadoraAritmetica;

public class CalculadoraAritmeticaTeste {

	private static int contador = 0;
	private double resultadoReal;
	private double resultadoEsperado;
	private String nomeTeste;
	
	@Before
	public void preparaTeste() {
		contador++;
		System.out.println("Iniciando o teste número: "+ contador);
	}
	
	
	
	@After
	public void encerraTeste() {
		System.out.println("Resultado da operação " + nomeTeste + ": "  + resultadoReal + "\n");
	}
	
	
	
	@Test
	public void testeSomar2com3() {
		nomeTeste = "somar 2 com 3";
		resultadoEsperado = 5;
		CalculadoraAritmetica calculadora = new CalculadoraAritmetica();
		resultadoReal = calculadora.somar(2, 3);
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}
	
	@Test
	public void testeMultiplicar5com50() {
		nomeTeste = "multiplicar 5 com 50";
		resultadoEsperado = 250;
		CalculadoraAritmetica calculadora = new CalculadoraAritmetica();
		resultadoReal = calculadora.multiplicar(5, 50);
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}
	
	@Test
	public void testeDividir3com7() {
		nomeTeste = "dividir 3 com 7";
		resultadoEsperado = 0.4285;
		CalculadoraAritmetica calculadora = new CalculadoraAritmetica();
		resultadoReal = calculadora.dividir(3, 7);
		assertEquals(resultadoEsperado, resultadoReal, 0.0001);
	}
	
	@Test
	public void testeSubtrair10com20() {
		nomeTeste = "subtrair 10 com 20";
		resultadoEsperado = -10;
		CalculadoraAritmetica calculadora = new CalculadoraAritmetica();
		resultadoReal = calculadora.subtrair(10, 20);
		assertEquals(resultadoEsperado, resultadoReal, 0);

	}
	

}
