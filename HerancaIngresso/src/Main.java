import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IngressoMeia meia = new IngressoMeia("A menina que roubava livro", "Legendado");
        IngressoFamilia familia = new IngressoFamilia("Lisbela e o prisioneiro", "Dublado");

        System.out.println("====== Meia Entrada ======");
        meia.calculaMeia();

        System.out.println("====== Ingresso Família ======");
        familia.calculaIngressoFamilia(2);

    }
}