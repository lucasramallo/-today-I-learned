import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    double A = scan.nextDouble();
    double B = scan.nextDouble();
    double C = scan.nextDouble();

    double media = ((A * 2) + (B * 3) + (C * 5)) / 10;
    System.out.printf("MEDIA = %.1f\n", media);
  }
 
}