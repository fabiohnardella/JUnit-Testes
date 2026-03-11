package FontesAppCalculadora;

//CLASSE CALCULADORA 

public class Calculadora{ 



    // atributo 

    private double resultado = 0; 



    // método somar 

    public double somar( double n1, double n2 ){ 



        resultado = n1 + n2; 

        return resultado; 

    } 



    // método subtrair 

    public double subtrair(double n1, double n2 ){ 



        resultado = n1 - n2; 

        return resultado; 

    }         



    // método multiplicar 

    public double multiplicar( double n1, double n2 ){ 



        resultado = n1 * n2; 

        return resultado; 

    } 



    // método dividir 

    public double dividir( double n1, double n2 ){ 



        resultado = n1 / n2; 

        return resultado; 

    } 

} 


