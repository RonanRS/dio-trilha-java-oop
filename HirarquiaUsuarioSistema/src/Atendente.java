public class Atendente extends Funcionario{
    double valorEmCaixa;

    public Atendente(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = false;
    }

    protected void receberPagamento(double pagamento){
        System.out.println("Pagamento recebido: €" + pagamento);
        System.out.println("Valor total em caixa: €" + (valorEmCaixa + pagamento));
    }

    protected void fecharCaixa(){
        System.out.println("Fechando caixa...");
    }

    @Override
    protected void consultarVendas() {

    }

    @Override
    protected void realizarLogins() {

    }

    @Override
    protected void realizarLogoff() {

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

    }

    // GETTERS & SETTERS
    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }
}
