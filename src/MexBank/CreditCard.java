/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MexBank;

/**
 *
 * @author patriciaortiz
 */
public class CreditCard extends Account {
   private double limiteCredito;
    
    
    public CreditCard (double limiteCredito, double montoActual){
    super(montoActual); //Si el saldo es negativo, significa que tiene a favor
    this.limiteCredito = limiteCredito;
    }
    
    //Método para sumar intereses solo si tiene dauda
    public void sumaIntereses(int meses){
        double cantidad = getMontoActual();
                if(cantidad >0) {
                cantidad = cantidad * Math.pow(1 + 0.15, meses); //formula para sacar el interés compuesto
                setMontoActual(cantidad);
                } 
    }//Método sumaIntereses
    
    
    //Método para mostrar el saldo
    public void mostrarSaldo(){
        double cantidad = getMontoActual();
    if (cantidad < 0){
        System.out.println("Saldo a favor: $" + Math.abs(cantidad));
    } else if (cantidad ==0){
        System.out.println("Saldo en 0, no hay deuda ni saldo a favor");
    }else {
        System.out.println("Deuda: $" + cantidad);
    }  
    }//Método mostrarSaldo
    
    
    //Método para "gastar" dinero de la tarjeta
    public void gastar (double cantidad){
    double nuevoSaldo = getMontoActual() + cantidad;
    if (cantidad <= limiteCredito){
    setMontoActual(nuevoSaldo);
    }else{
    System.out.println("No puedes gastar más del limite de crédito");
    }
    }// Método gastar
 
    //Getter limite de credito
    public double getLimiteCredito(double par) {
    return limiteCredito;
    }//getter LimiteCredito

 
    
}//CreditCard
