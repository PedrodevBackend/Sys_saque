

public class TestaExemplodeClasses{
    public static void main(String[] args){
        ContaPoupanca cp = new ContaPoupanca();
        cp.saqueConta(30.00);
        System.out.println("Saldo em Poupança : " + cp.saldo);

        ContaCorrente cr = new ContaCorrente();
        cr.saqueConta(500.00);
        System.out.println("Saldo em conta corrente é :"+ cr.saldo);
    }
}