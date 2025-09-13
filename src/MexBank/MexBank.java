/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MexBank;

/**
 *
 * @author patriciaortiz
 */
public class MexBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//TARJETA DE CREDITO
        
      CreditCard credit = new CreditCard(10000, -5000); // límite = 10000, deuda = -5000
        System.out.println("TARJETA DE CRÉDITO");
        System.out.println("Tienes un límite de crédito de: $" + credit.getLimiteCredito());
        System.out.println("Deuda actual sin intereses: $" + Math.abs(credit.getMontoActual()));


       //Aplicacion de intereses por "x" numero de meses
       credit.sumaIntereses(2);
        
          // Pago de la deuda
        credit.depositar(3000); 
        credit.pagarDeuda(); 
    

//TARJETA DE DEBITO           
       DebitCard debit = new DebitCard(2000);
       System.out.println("TARJETA DE DÉBITO");
       
       //Saldo inicial
       System.out.println("Saldo inicial de tarjeta débito: $"+ debit.getMontoActual());
       
       //Depositar
       debit.depositar(500);
       System.out.println("Saldo actual después de depositar: $" + debit.getMontoActual());
       
       //Retirar
       debit.retirar(1000);
       System.out.println("Saldo después de retirar: $" + debit.getMontoActual());
      
        //Intentar retirar más de lo disponible
        debit.retirar(3000);
        
        
//CUENTA DE AHORRO
        
        SavingsAccount savings = new SavingsAccount(1000);
        
        System.out.println("CUENTA DE AHORRO");
         //Saldo inicial
       System.out.println("Saldo inicial de la cuenta de ahorro: $"+ savings.getMontoActual());
       
       //Depositar
       savings.depositar(300);
       System.out.println("Saldo después de depositar para invertir: $" + savings.getMontoActual());
       
        //Invertir (aumenta el 10%)
       savings.invertir();
       System.out.println("Saldo después de invertir: $" + savings.getMontoActual());
        
        
        
    }//Main
    
}//MexBank
