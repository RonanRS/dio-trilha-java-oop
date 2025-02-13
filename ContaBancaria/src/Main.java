import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ContaCliente cliente = new ContaCliente();

        System.out.println("*** Bem-vindo ao menu de Criação de Conta no BANCO MUNDIAL ***");
        System.out.print("Primeiro digite seu nome completo: ");
        String nomeCliente = scan.nextLine();
        cliente.setName(nomeCliente);

        System.out.println("Olá " + nomeCliente + ", para procedermos com a criação da sua conta é necessário um depósito inicial.");
        System.out.print("Valor a depositar: ");
        double primeiroDeposito = scan.nextDouble();
        cliente.setDepositoInicial(primeiroDeposito);
        cliente.calculaSaldoTotal();

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
        System.out.println("0 - SAIR");
        System.out.println("***");

        while (true) {
            System.out.print("Sua opção: ");
            int opcao = scan.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo total é de: " + cliente.getSaldoTotal());
                System.out.println("--------------------");
                System.out.println("Deseja realizar mais alguma operação?");

            } else if (opcao == 2) {
                cliente.consultaChequeEspecial();
                System.out.println("--------------------");
                System.out.println("Deseja realizar mais alguma operação?");

            } else if (opcao == 3) {
                System.out.print("Quanto deseja depositar: ");
                double deposito = scan.nextDouble();
                cliente.depositaDinheiro(deposito);
                System.out.println("--------------------");
                System.out.println("Deseja realizar mais alguma operação?");

            } else if (opcao == 4) {
                System.out.print("Digite o valor a ser levantado: ");
                double valorLevantado = scan.nextDouble();
                cliente.sacaDinheiro(valorLevantado);
                System.out.println("--------------------");
                System.out.println("Deseja realizar mais alguma operação?");

            } else if (opcao == 5) {
                System.out.print("Qual o valor da fatura a pagar: ");
                double valorFatura = scan.nextDouble();
                cliente.pagaBoleto(valorFatura);
                System.out.println("--------------------");
                System.out.println("Deseja realizar mais alguma operação?");

            } else if (opcao == 6) {
                cliente.verificaUsoDoChequeEspecial();
                System.out.println("--------------------");
                System.out.println("Deseja realizar mais alguma operação?");

            } else if (opcao == 0) {
                System.out.println("Saindo da aplicação...");
                break;

            } else {
                System.out.println("Opção inválida, escolha uma das opções acima.");
            }
        }
    }
}