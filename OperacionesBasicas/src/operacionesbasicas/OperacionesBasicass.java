
package operacionesbasicass;


/**
 *
 * @author maryse
 * 
 * Programa para realizar operaciones básicas :
 * suma, resta, multiplicación y division.
 * 
 */

public class OperacionesBasicass {
    
    //int valor1 = 10, valor2 = 8;
    double res =0;
    

    
    public void Suma(int valor1, int valor2){
        res= valor1 + valor2;
        System.out.println("suma: "+ res);
    }
    public void Res(int valor1, int valor2){
       res = valor1-valor2;
       System.out.println("resta: "+ res);
    }
    public void Mult(int valor1, int valor2){
      res = valor1 * valor2;
      System.out.println("multiplicacion: "+ res);
    }
    public void Div (int valor1, int valor2){
      res= valor1/ valor2;
      System.out.println("division: "+ res);
    }

    public static void main(String[] args) {        
        OperacionesBasicass suma = new OperacionesBasicass();
        suma.Suma(2,5);
        OperacionesBasicass res = new OperacionesBasicass();
        res.Res(17,8);
        OperacionesBasicass mult = new OperacionesBasicass();
        mult.Mult(2,5);
        OperacionesBasicass div = new OperacionesBasicass();
        div.Div(10,2);
    }
}

