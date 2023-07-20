import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();

        int rest = value % 100;

        int notasDeCem = value / 100;
        rest = value % 100;

        int notasDeCinquenta = rest / 50;
        rest = rest % 50;

        int notasDeVinte = rest / 20;
        rest = rest % 20;

        int notasDeDez = rest / 10;
        rest = rest % 10;

        int notasDeCinco = rest / 5;
        rest = rest % 5;

        int notasDeDois = rest / 2;
        rest = rest % 2;

        int notasDeUm = rest / 1;
        rest = rest % 1;
        
        System.out.println(value);
        System.out.println(String.format("%d nota(s) de R$ 100,00", notasDeCem));
        System.out.println(String.format("%d nota(s) de R$ 50,00", notasDeCinquenta));
        System.out.println(String.format("%d nota(s) de R$ 20,00", notasDeVinte));
        System.out.println(String.format("%d nota(s) de R$ 10,00", notasDeDez));
        System.out.println(String.format("%d nota(s) de R$ 5,00", notasDeCinco));
        System.out.println(String.format("%d nota(s) de R$ 2,00", notasDeDois));
        System.out.println(String.format("%d nota(s) de R$ 1,00", notasDeUm));

    }
 
}