import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for(int i = 0; i <= N; i++) {
            if(i % 2 == 0 && i != 0) {
                int quadrado = i * i;
                System.out.println(String.format("%d^2 = %d", i, quadrado));
            }
        }
    }
}