// Consulte o README no repositório para o enunciado do exercício
public class Main {
    public static void main(String[] args) {

        // Cria os objetos referente a cada uma das classes e herda os atributos da classe Funcionario
        Gerente gerente = new Gerente("Ronan", "ronan@gmail.com", "gerente123", true);
        Atendente atendente = new Atendente("Maria", "Maria@gmail.com", "Maria123", false);
        Vendedor vendedor = new Vendedor("Bruno", "Bruno@gmail.com", "Bruno123", false);

        // Chama Vendedor
        System.out.println("========= Vendedor ========");
        vendedor.realizarLogins();
        System.out.println("Utilizador admin: " + vendedor.isAdministrador());
        vendedor.realizarVenda();
        vendedor.consultarVendas();
        vendedor.realizarVenda();
        vendedor.consultarVendas();
        vendedor.realizarVenda();
        vendedor.consultarVendas();
        vendedor.alterarDados();
        vendedor.alterarSenha();
        vendedor.realizarLogoff();

        System.out.println();

        // Chama Gerente
        System.out.println("========= Gerente ========");
        gerente.realizarLogins();
        System.out.println("Utilizador admin: " + gerente.isAdministrador());
        gerente.gerarRelatorioFinanceiro();
        gerente.consultarVendas();
        gerente.alterarDados();
        gerente.alterarSenha();
        gerente.realizarLogoff();

        System.out.println();


        // Chama Atendente
        System.out.println("======== Atendente =========");
        atendente.realizarLogins();
        System.out.println("Utilizador admin: " + atendente.isAdministrador());
        System.out.println("Valor em caixa: " + atendente.valorEmCaixa);
        atendente.receberPagamento(300);
        atendente.consultarVendas();
        atendente.alterarDados();
        atendente.alterarSenha();
        atendente.fecharCaixa();
        System.out.println("Valor em caixa: " + atendente.getValorEmCaixa());
        atendente.realizarLogoff();

    }
}