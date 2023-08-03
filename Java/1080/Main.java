import java.io.IOException;
import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);

    int maior = 0;
    int index = 0;

    for(int i = 0; i < 100; i++){
      int number = scan.nextInt();
      if(maior == 0) {
        maior = number;
        index = 1;
      } else if(number > maior){
        maior = number;
        index = i+1;
      }
    }

    System.out.println(maior);
    System.out.println(index);
  }
}