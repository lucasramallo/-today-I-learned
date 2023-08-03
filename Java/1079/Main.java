import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i = 0; i < N; i++) {
            Double nota1 = scan.nextDouble();
            Double nota2 = scan.nextDouble();
            Double nota3 = scan.nextDouble();

            Double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

            System.out.println(String.format("%.2f", media));
        }
    }
 
}