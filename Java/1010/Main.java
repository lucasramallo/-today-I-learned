import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String line1 = scan.nextLine();
        String line2 = scan.nextLine();

        String[] values1 = line1.split(" ");
        String[] values2 = line2.split(" ");
        
        int codigo1 = Integer.parseInt(values1[0]); 
        int numeroDePecas1 = Integer.parseInt(values1[1]);
        double valor1 = Double.parseDouble(values1[2]);

        int codigo2 = Integer.parseInt(values2[0]); 
        int numeroDePecas2 = Integer.parseInt(values2[1]);
        double valor2 = Double.parseDouble(values2[2]);

        double total = (valor1 * numeroDePecas1) + (valor2 * numeroDePecas2);
    
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));

    }

}