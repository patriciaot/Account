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
        
        CreditCard credit = new CreditCard (10000, -5000);//limite de tarjeta de credito : 10,000 // Saldo a favor (saldo negativo): -5000
        
        //Limite de crédito
        System.out.println("Tienes un límite de crédito de: $" + credit.getLimiteCredito(10000));
        
        
        //Saldo a favor
        credit.mostrarSaldo(); //-5000
        
        //Ejemplo de gastar y seguir teniendo saldo a favor
        credit.gastar(3000); //Gasté $3000
        credit.mostrarSaldo();// -$2000, aún a favor
        
        
        //Ejemplo de gastar $2500 más y ahora tengo una deuda
        credit.gastar(2500);
        credit.mostrarSaldo();// 500 (deuda)
        
        //Aplicacion de intereses de la deuda
        credit.sumaIntereses(6); //Se aplicaran intereses a 6 meses
        credit.mostrarSaldo();// muestra deuda con intereses
        
        

//TARJETA DE DEBITO           
       DebitCard debit = new DebitCard(2000);
       //Saldo inicial
       System.out.println("Saldo inicial de tarjeta débito: "+ debit.getMontoActual());
       
       //Depositar
       debit.depositar(500);
       System.out.println("Saldo después de depositar $500: " + debit.getMontoActual());
       
       //Retirar
       debit.retirar(1000);
       System.out.println("Saldo después de retirar $1000: " + debit.getMontoActual());
      
        //Intentar retirar más de lo disponible
        debit.retirar(3000);
        
        
        //CUENTA DE AHORRO
        
        SavingsAccount savings = new SavingsAccount(1000);
         //Saldo inicial
       System.out.println("Saldo inicial de la cuenta de ahorro: "+ savings.getMontoActual());
       
       //Depositar
       savings.depositar(4000);
       System.out.println("Saldo después de depositar $4000: " + savings.getMontoActual());
       
        //Invertir (aumenta el 10%)
       savings.invertir();
       System.out.println("Saldo después de invertir: " + savings.getMontoActual());
        
        
        
    }//Main
    
}//MexBank
