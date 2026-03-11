package TestesAppCalculadora;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test; 

import FontesAppCalculadora.Calculadora; 

 

public class CalculadoraTeste { 


	//Atributos de controle do teste
	private static int numeroTeste = 0;
	private String nomeTeste = "";
	private double resultadoReal = 0;
	
	//PREPARAÇÃO DO TESTE
	@Before
	public void preparaTeste() {
		numeroTeste = numeroTeste + 1;
		System.out.print("Iniciando o teste número: ");
		System.out.println(numeroTeste);
	}
	
	//ENCERRAMENTO DO TESTE
	@After
	public void encerraTeste() {
	    System.out.print(nomeTeste);
	    System.out.print(" - resultado = ");
	    System.out.println(resultadoReal);
	}
	
	
    /** 
    * Teste de somar na Calculadora. 

    */ 

   @Test 

   public void testeSomar5com5() { 
	   nomeTeste = "Teste de soma de 5 com 5";
	        

	   double nro1 = 5; 

	   double nro2 = 5; 

       Calculadora calc= new Calculadora(); 

       double resultadoEsperado = 10; 

       resultadoReal= calc.somar(nro1, nro2);       
      
       assertEquals(resultadoEsperado, resultadoReal, 0); 

   } 

 

   /** 

   * Teste de subtrair na  Calculadora. 

   */ 

  @Test 

  public void testeSubtrair3de5() {
	   nomeTeste = "Teste de subtrair 3 de 5";


	   double nro1 = 5; 

	   double nro2 = 3; 

      Calculadora calc = new Calculadora(); 

      double resultadoEsperado= 2; 

      resultadoReal= calc.subtrair(nro1, nro2); 

     
      assertEquals(resultadoEsperado, resultadoReal, 0);   

  } 

   

   /** 

   * Teste de multiplicar na Calculadora. 

   */ 

   @Test 

   public void testeMultiplicar3por3() {
	   nomeTeste = "Teste de multiplicar 3 por 3";

	   
	   double nro1 = 3; 

	   double nro2 = 3; 

       Calculadora calc = new Calculadora(); 

       double resultadoEsperado = 9; 

       resultadoReal = calc.multiplicar(nro1, nro2); 

       
       assertEquals(resultadoEsperado, resultadoReal, 0); 

   } 

 

   /** 

   * Teste de dividir na Calculadora. 

   */ 

  @Test 

  public void testeDividir3por2() { 
	   nomeTeste = "Teste de dividir 3 por 2";

	   
	   double nro1 = 3; 

	   double nro2 = 2; 

      Calculadora calc = new Calculadora(); 

      double resultadoEsperado= 1.5; 

      resultadoReal = calc.dividir(nro1, nro2); 


      
      assertEquals(resultadoEsperado, resultadoReal, 0.1); 

  } 

   

  @Test 

  public void testeDividir3por7() { 
	   nomeTeste = "Teste de dividir 3 por 7";

	   
	   double nro1 = 3; 

	   double nro2 = 7; 

      Calculadora calc = new Calculadora(); 

      double resultadoEsperado= 0.4285; 

      resultadoReal = calc.dividir(nro1, nro2); 


      
      assertEquals(resultadoEsperado, resultadoReal, 0.0001); 

  } 

   

} 

 
