import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double avaliacao = 0;
        double nota = 0;
        int totalNota = 0;

        while (nota != -1) {
            System.out.println("diga sua avaliacao do filme ");
            nota = leitura.nextDouble();
            if (nota != -1) {
                avaliacao += nota;
                totalNota++;
            }
        }

        System.out.println("media da avaliacao " + avaliacao / totalNota);
    }
}
