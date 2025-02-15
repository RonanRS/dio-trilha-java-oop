public class Atendente extends Funcionario{
    double valorEmCaixa;

    public Atendente(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = false;
    }

    protected void receberPagamento(double pagamento){
        double somaCaixa = valorEmCaixa + pagamento;
        System.out.println("Pagamento recebido: €" + pagamento);
        System.out.println("Valor total em caixa: €" + somaCaixa);
        setValorEmCaixa(somaCaixa);
    }

    protected void fecharCaixa(){
        System.out.println("Fechando caixa...");
    }

    @Override
    protected void consultarVendas() {
        System.out.println("Atendente " + getNome() + " consultando vendas...");
        System.out.println("Total de vendas: " + getTotalVenda());
    }

    @Override
    protected void realizarLogins() {
        System.out.println("Realizando login como: " + getNome());
    }

    @Override
    protected void realizarLogoff() {
        System.out.println("Utilizador " + getNome() + " deslogando...");
    }

    @Override
    protected void alterarDados() {
        System.out.println("Escolha o dado a ser alterado: ");
        System.out.println("Nome: " + getNome());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Senha: " + getSenha());
    }

    @Override
    protected void alterarSenha() {
        System.out.println("Alterando senha do utilizador: " + getNome());
    }

    // GETTERS & SETTERS
    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }
}
