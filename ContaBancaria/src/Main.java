import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ContaCliente cliente = new ContaCliente();

        System.out.println("*** Bem-vindo ao menu de Criação de Conta no BANCO MUNDIAL ***");
        System.out.println("Primeiro digite seu nome completo: ");
        String nomeCliente = scan.nextLine();
        cliente.setName(nomeCliente);

        System.out.println("Olá " + nomeCliente + ", para procedermos com a criação da sua conta é necessário um depósito inicial.");
        System.out.println("Valor a depositar: ");
        double primeiroDeposito = scan.nextDouble();
        cliente.setDepositoInicial(primeiroDeposito);

        System.out.println("Com esse valor de depósito tens direito a um cheque especial no valor de: " + cliente.getChequeEspecial());

        System.out.println(" **** CAIXA ELETRÔNICO ****");
        System.out.println("Escolha uma das opções para continuar");

        System.out.println("***");
        System.out.println("1 - Consultar saldo total da conta. (Inclui Cheque Especial)");
        System.out.println("2 - Consultar valor do Cheque Especial.");
        System.out.println("3 - Depositar dinheiro.");
        System.out.println("4 - Levantar dinheiro.");
        System.out.println("5 - Fazer pagamento de uma fatura.");
        System.out.println("6 - Verificar se a conta está usando o cheque especial.");
        System.out.println("***");

        System.out.print("Sua opção: ");
        int opcao = scan.nextInt();


    }
}