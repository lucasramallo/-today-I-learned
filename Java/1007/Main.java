import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);

    int A = scan.nextInt();
    int B = scan.nextInt();
    int C = scan.nextInt();
    int D = scan.nextInt();

    int calc = ((A * B) - (C * D));

    System.out.printf("DIFERENCA = %d\n", calc);
  }
 
}