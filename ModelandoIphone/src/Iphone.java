public class Iphone implements Ipod, Telefone, Internet {
    String modelo;

    // Construtor para obrigar a inicialização da classe com um modelo de Iphone
    public Iphone(String modelo) {
        this.modelo = modelo;
    }

    // Getters and Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    // Métodos próprios da classe Iphone
    protected void Ligar(){
        System.out.println("Ligando Iphone " + modelo);
    }

    protected void Desligar(){
        System.out.println("Desligando Iphone" + modelo);
    }

    // Métodos implementados da interface Internet
    @Override
    public void ExibirPagina(String url) {
        System.out.println("A exibir página " + url);
    }

    @Override
    public void AdicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void AtualizarPagina() {
        System.out.println("Página atualizada com sucesso.");
    }


    // Métodos implementados da interface Ipod
    @Override
    public void TocarMusica() {
        System.out.println("Tocando música.");
    }

    @Override
    public void PausarMusica() {
        System.out.println("Pausando música...");
    }

    @Override
    public void SelecionarMusica(String musica) {
        System.out.println("Selecionando música " + musica);
    }

    // Métodos implementados da interface Telefone
    @Override
    public void FazerChamada(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void Atender() {
        System.out.println("Atendendo chamada de voz.");
    }

    @Override
    public void IniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
