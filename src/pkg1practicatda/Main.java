package pkg1practicatda;

/**
 *
 * @author Diaz
 */
public class Main {
  public static void main(String[] args) {
      //creamos objetos 
     Operaciones calculadora = new Operaciones (2,2); 
     
     //imprimimos la suma
     System.out.println("la suma es:" + calculadora.sumar());
     System.out.println("la resta es:" + calculadora.restar());
     System.out.println("la multiplicion es " + calculadora.multiplicar());
     System.out.println("la division es:" + calculadora.dividir());
    }
    
}
