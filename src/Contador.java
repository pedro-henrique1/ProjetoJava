import java.util.Random;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int numero = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        int tentativa = 0;
        while (tentativa < 5) {
            System.out.println("numero 0 e 10");
            int numeroDigitaldo = leitura.nextInt();
            tentativa++;
            System.out.println(numero);

            if (numero == numeroDigitaldo) {
                System.out.println("acertou " + tentativa + " tentativas");
                break;
            } else if (numero < numeroDigitaldo) {
                System.out.println("numero digitado e menor");
            } else {
                System.out.println("numero digitado e maior");
            }
        }
        if (tentativa == 5) {
            System.out.println("voce nao advinhou em 5 tentativas");
        }

    }
}
