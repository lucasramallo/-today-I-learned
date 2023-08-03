import java.io.IOException;
import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);

    while(scan.hasNextInt()){

      if (!scan.hasNextInt()) {
        break;
      }

      int number1 = scan.nextInt();
      int number2 = scan.nextInt();

      if(number1 < number2) {
        System.out.println("Crescente");
      }else if(number1 > number2) {
        System.out.println("Decrescente");
      }
    }
    scan.close();
  }
}