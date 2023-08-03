import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();

    for (int i = 0; i < N; i++) {
      if(i == N - 1){
        System.out.println(fib(i));
      } else {
        System.out.print(fib(i) + " ");
      }
    }
  }

  public static int fib(int n) {
    if (n == 0) {
        return 0;
    } else if (n == 1) {
        return 1;
    } else {
        return fib(n - 2) + fib(n - 1);
    }
  }
}
