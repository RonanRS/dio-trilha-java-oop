public class Vendedor extends Funcionario{

    public Vendedor(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = false;
    }

    protected void realizarVenda(){
        System.out.println("Realizando venda...");
        setTotalVenda(totalVenda + 1);
    }

    @Override
    protected void consultarVendas() {
        System.out.println("Vendedor " + getNome() + " consultando vendas...");
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
