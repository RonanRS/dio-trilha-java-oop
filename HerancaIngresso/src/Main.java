import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        IngressoMeia meia = new IngressoMeia("A menina que roubava livro", "Dublado");
        IngressoFamilia familia = new IngressoFamilia("Lisbela e o prisioneiro", "Dublado");

        meia.calculaMeia();
        System.out.println("-------------------------");
        familia.calculaIngressoFamilia(3);

    }
}