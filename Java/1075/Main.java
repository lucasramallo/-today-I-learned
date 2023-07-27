import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i = 0; i < 10000; i++) {
            if(i % N == 2) {
                System.out.println(i);
            }
        }   
    }
 
}