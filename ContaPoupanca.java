

public class ContaPoupanca extends Conta {
   String datasAniversario;

   @Override
   void saqueConta(double valor){
    if((saldo - valor) < 0)
        System.out.println("ERRO : saldo ficara abaixo de 0.00");
    else 
        saldo = saldo -valor; 

   }
}