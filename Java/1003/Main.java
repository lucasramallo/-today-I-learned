import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
      Scanner read = new Scanner(System.in);
      double raio = read.nextDouble();
      double pi = 3.14159;

      double a = pi * (raio * raio);

      System.out.printf("A=%.4f\n", a);
    }
 
}