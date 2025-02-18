
public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("16 Pro Max");

        // Classes próprias Iphone
        System.out.println("======= " + iphone.modelo + " =======");
        iphone.Ligar();
        iphone.Desligar();
        System.out.println();

        // Implementação Ipod
        System.out.println("======= " + iphone.modelo + " =======");
        iphone.TocarMusica();
        iphone.PausarMusica();
        iphone.SelecionarMusica("CopyCat - Lacrimosa");
        System.out.println();

        // Implementação Telefone
        System.out.println("======= " + iphone.modelo + " =======");
        iphone.FazerChamada("964123456");
        iphone.Atender();
        iphone.IniciarCorreioVoz();
        System.out.println();

        // Implementação Internet
        System.out.println("======= " + iphone.modelo + " =======");
        iphone.ExibirPagina("www.google.com");
        iphone.AdicionarNovaAba();
        iphone.AtualizarPagina();
    }
}