import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);

    Double salary = scan.nextDouble();

    process(salary);
  }

  public static void process(Double salary) {

    Double novoSalario = null;
    Double reajuste = null;
    int percentual = 0;

    if (salary <= 400) {
      reajuste = salary * 0.15;
      novoSalario = (salary + reajuste);
      percentual = 15;
    } else if (salary > 400 && salary <= 800) {
      reajuste = salary * 0.12;
      novoSalario = (salary + reajuste);
      percentual = 12;
    } else if (salary > 800 && salary <= 1200) {
      reajuste = salary * 0.10;
      novoSalario = (salary + reajuste);
      percentual = 10;
    } else if (salary > 1200 && salary <= 2000) {
      reajuste = salary * 0.07;
      novoSalario = (salary + reajuste);
      percentual = 7;
    } else if (salary > 2000) {
      reajuste = salary * 0.04;
      novoSalario = (salary + reajuste);
      percentual = 4;
    }

    System.out.println(String.format("Novo salario: %.2f", novoSalario));
    System.out.println(String.format("Reajuste ganho: %.2f", reajuste));
    System.out.println(String.format("Em percentual: %d %%", percentual));
  }

}