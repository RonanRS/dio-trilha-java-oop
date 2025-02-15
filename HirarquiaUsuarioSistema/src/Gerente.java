public class Gerente extends Funcionario{

    protected void gerarRelatorioFinanceiro(){
        System.out.println("Gerando relatório...");
    }

    public Gerente(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = true;
    }

    @Override
    protected void consultarVendas() {
        System.out.println("Utilizador " + getNome() + " consultando vendas...");
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

}
