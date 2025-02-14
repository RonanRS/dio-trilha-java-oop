public class IngressoFamilia extends Ingresso{
    int membrosFamilia;

    public void calculaIngressoFamilia(int membrosFamilia){
        valor = 15;
        double valorIngressoFamilia;
        double descontoFamilia;
        if (membrosFamilia >= 3){
            descontoFamilia = (valor * membrosFamilia) *0.05;
            valorIngressoFamilia = (valor * membrosFamilia) - descontoFamilia;
            System.out.println("O valor total dos ingressos com 5% de desconto fica em €" + valorIngressoFamilia);

        }else
            System.out.println("O desconto família aplica-se apenas para 3 membros ou mais.");
    }

}
