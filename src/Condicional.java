public class Condicional {
    public static void main(String[] args) {
        int ano = 202;
        boolean incluidoPlano = true;
        double notaFilme = 2.3;

        String tipoPlano = "normal";

        if (ano >= 2022) {
            System.out.println("Lançamento que os clientes estao curtindo");
        } else {
            System.out.println("Filme retro que vale a pena assistir");
        }

        if (incluidoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("filme liberado");
        }else {
            System.out.println("pagar locaçao");
        }



    }
}
