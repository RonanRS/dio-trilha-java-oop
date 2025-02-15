public abstract class Funcionario {
    protected String nome;
    protected String email;
    protected String senha;
    protected boolean administrador;
    protected static int totalVenda;


// MÉTODOS ABSTRATOS
    protected abstract void consultarVendas();
    protected abstract void realizarLogins();
    protected abstract void realizarLogoff();
    protected abstract void alterarDados();
    protected abstract void alterarSenha();


// GETTERS & SETTERS
    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(int totalVenda) {
        this.totalVenda = totalVenda;
    }
}
