package pkg1practicatda;

/**
 *
 * @author Diaz
 */
public class Operaciones {
    public int valor1;
    public int valor2;
   
    //Constructor
    public Operaciones (int num1, int num2){
        this.valor1 = num1;
        this.valor2 = num2;
    
    
    }
    
   public int sumar(){
         return this.valor1 + this.valor2;
   }
   public int restar(){
        return this.valor1 - this.valor2;
           }
   public int multiplicar(){
        return this.valor1 * this.valor2;
           }
   public int dividir(){
         return this.valor1 / this.valor2;
           }
}
