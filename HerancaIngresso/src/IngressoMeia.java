public class IngressoMeia extends Ingresso{

    public IngressoMeia(String nomeFilme, String dubladoLegendado) {
        this.nomeFilme = nomeFilme;
        this.dubladoLegendado = dubladoLegendado;
    }

    public void calculaMeia(){
        valor = 15;
        System.out.println(nomeFilme);
        System.out.println(dubladoLegendado);
        System.out.println("O valor normal do ingresso custa €" + valor + ", a meia entrada fica em €" + valor/2);
    }

}

