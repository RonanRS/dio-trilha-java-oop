//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Ronan", "ronan@gmail.com", "gerente123", true);
        Atendente atendente = new Atendente("Maria", "Maria@gmail.com", "Maria123", false);
        Vendedor vendedor = new Vendedor("Bruno", "Bruno@gmail.com", "Bruno123", false);

        gerente.alterarDados();
        System.out.println("=================");
        atendente.alterarDados();
        System.out.println("=================");
        vendedor.alterarDados();
    }
}