import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
      Scanner read = new Scanner(System.in);
      int a = read.nextInt();
      int b = read.nextInt();

      int x = a + b;

      System.out.printf("X = %d\n", x);
      
    }
}
