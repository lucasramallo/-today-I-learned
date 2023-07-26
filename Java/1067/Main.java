import java.io.IOException;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();

        for(int i = 0; i <= X; i++) {
            if((i % 2) != 0) {
                System.out.println(i);
            }
        }
    }
}