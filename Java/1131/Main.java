import java.io.IOException;
import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int grenais = 0;
    int vitoriasInter = 0;
    int vitoriasGremio = 0;
    int empates = 0;

    while (true) {
      int golsInter = scanner.nextInt();
      int golsGremio = scanner.nextInt();
      grenais++;

      if (golsInter > golsGremio) {
          vitoriasInter++;
      } else if (golsInter < golsGremio) {
          vitoriasGremio++;
      } else {
          empates++;
      }

      System.out.println("Novo grenal (1-sim 2-nao)");
      int opcao = scanner.nextInt();

      if (opcao == 2) {
          break;
      }
    }

    scanner.close();

    System.out.println(grenais + " grenais");
    System.out.println("Inter:" + vitoriasInter);
    System.out.println("Gremio:" + vitoriasGremio);
    System.out.println("Empates:" + empates);

    if (vitoriasInter > vitoriasGremio) {
        System.out.println("Inter venceu mais");
    } else if (vitoriasInter < vitoriasGremio) {
        System.out.println("Gremio venceu mais");
    } else {
        System.out.println("Nao houve vencedor");
    }
  }
}