import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner read = new Scanner(System.in);
    double A = read.nextDouble();
    double B = read.nextDouble();
    
    double media = ((A * 3.5) + (B * 7.5)) / 11;

    System.out.printf("MEDIA = %.5f\n", media);
  }
 
}