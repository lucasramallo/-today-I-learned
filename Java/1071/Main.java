import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();
        int Y = scan.nextInt();
        int soma = 0;

        if (Y < X) {
            int temp = X;
            X = Y;
            Y = temp;
        }

        for (int i = X + 1; i < Y; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);
    }
}
