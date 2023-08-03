import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        boolean validarNota1 = true;
        double nota1 = 0.0;

        while (validarNota1) {
            double primeiraNota = nota1(scan);

            if (primeiraNota != 0.0) {
                nota1 = primeiraNota;
                validarNota1 = false;
            } else {
                System.out.println("nota invalida");
            }
        }

        boolean validarNota2 = true;
        double nota2 = 0.0;

        while (validarNota2) {
            double segundaNota = nota2(scan);

            if (segundaNota != 0.0) {
                nota2 = segundaNota;
                validarNota2 = false;
            } else {
                System.out.println("nota invalida");
            }
        }

        double media = (nota1 + nota2) / 2;
        System.out.println(String.format("media = %.2f", media));

        scan.close();
    }

    public static double nota1(Scanner scan) {
        double nota = scan.nextDouble();

        if (nota <= 10.0 && nota >= 0) {
            return nota;
        }

        return 0.0;
    }

    public static double nota2(Scanner scan) {
        double nota = scan.nextDouble();

        if (nota <= 10.0 && nota >= 0) {
            return nota;
        }

        return 0.0;
    }
}
