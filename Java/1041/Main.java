import java.io.IOException;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        String areMultiple = areMultiple(A, B) ? "Sao Multiplos" : "Nao sao Multiplos";

        System.out.println(areMultiple);
    }

    public static boolean areMultiple(int A, int B) {
        if(A % B == 0 || B % A == 0) {
            return true;
        }
        return false;
    }
 
}