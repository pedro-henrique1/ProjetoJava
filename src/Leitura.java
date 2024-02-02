import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        System.out.println("digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("digite o ano do seu filme favorito");
        int anoDeLnacamento = leitura.nextInt();
        System.out.println("diga sua avaliacao do filme ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLnacamento);
        System.out.println(avaliacao);

    }
}
