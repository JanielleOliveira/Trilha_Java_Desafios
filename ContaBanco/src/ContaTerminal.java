import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println(" ------------ Conta Bancária -------------- ");
        System.out.println("--------------------------------------------");
        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = sc.nextLine();
        System.out.println("Digite a agência conta: ");
        agencia = sc.nextLine();
        System.out.println("Digite o número da conta: ");
        numeroConta = sc.nextInt();
        System.out.println("Saldo Inicial: ");
        saldo = sc.nextDouble();
        System.out.println("--------------------------------------------");

        System.out.println("Olá " + nomeCliente + ", obrigada por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numeroConta + " e o seu saldo de R$" + saldo + " já está disponível para saque.");


    }
}
