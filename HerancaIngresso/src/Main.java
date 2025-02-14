import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        IngressoMeia meia = new IngressoMeia();
        IngressoFamilia familia = new IngressoFamilia();

        meia.calculaMeia();
        familia.calculaIngressoFamilia(10);



    }
}