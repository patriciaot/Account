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
    super(montoActual); 
    this.limiteCredito = limiteCredito;
    }
    
    //Método al depositar y pagar deuda
  public void pagarDeuda() {
    double cantidad = getMontoActual(); 
    if (cantidad < 0) {
        System.out.println("Deuda actual después de pagar: $" + Math.abs(cantidad));
    } else if (cantidad > 0) {
        System.out.println("Tienes un saldo a favor de: $" + cantidad);
    } else {
        System.out.println("Deuda saldada");
    }
}//pagarDeuda
  
     //Método para sumar intereses solo si tiene deuda
    public void sumaIntereses(int meses){
        double cantidad = getMontoActual();
                if(cantidad <0) {
                double deudaConIntereses = cantidad * Math.pow(1 + 0.15, meses);
                setMontoActual(deudaConIntereses);
                System.out.println("Deuda actual con intereses: $" + Math.abs(deudaConIntereses));
                } 
    }//Método sumaIntereses
 
    //Getter limite de credito
    public double getLimiteCredito() {
    return limiteCredito;
    }//getter LimiteCredito

 
    
}//CreditCard
