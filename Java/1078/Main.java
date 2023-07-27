import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(String.format("%d x %d = %d", i, N, i * N));
        }
 
    }
}