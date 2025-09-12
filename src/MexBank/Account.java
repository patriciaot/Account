/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MexBank;

/**
 *
 * @author patriciaortiz
 */
public class Account {
    private double montoActual;
    
    //Apertura
    public Account (double apertura){
        this.montoActual= apertura;
    }
    
    //Depositar
    public void depositar (double cantidad){
        this.montoActual += cantidad;
    }
    
    
    //Método get y set
    
    public void setMontoActual (double montoActual){
    this.montoActual= montoActual;
    }
    
    public double getMontoActual(){
    return this.montoActual;
    }
    
    
} //Account
