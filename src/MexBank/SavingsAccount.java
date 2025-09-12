/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MexBank;

/**
 *
 * @author patriciaortiz
 */
public class SavingsAccount extends Account {
    
    public SavingsAccount (double montoActual){
    super(montoActual);
    }
    
    public void invertir(){
    double cantidad = getMontoActual() * (0.10);
        setMontoActual(getMontoActual()+cantidad);
   }
   
    
}//SavingsAccount
