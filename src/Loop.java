import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double avaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("diga sua avaliacao do filme ");
            nota = leitura.nextDouble();
            avaliacao += nota;
        }

        System.out.println("media da avaliacao " + avaliacao/3);

    }
}
