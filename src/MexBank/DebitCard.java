/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MexBank;

/**
 *
 * @author patriciaortiz
 */
public class DebitCard extends Account {
    
   public DebitCard (double montoActual){
       super (montoActual);
   }
   
   public boolean retirar(double cantidad){
    if(cantidad <= getMontoActual()){
        setMontoActual(getMontoActual() - cantidad);
        System.out.println("Retiro exitoso de: $"+ cantidad);
        return true;
    } else{
        System.out.println("saldo insuficiente para retirar");
        return false;
    }
   } //Método retirar
   
}//DebitCard

