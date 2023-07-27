import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int in = 0;
        int out = 0;

        for(int i = 0; i < N; i++) {
            int X = scan.nextInt();
            if(X >= 10 && X <= 20) {
                in++;
            } else{
                out++;
            }
        }

        System.out.println(String.format("%d in", in));
        System.out.println(String.format("%d out", out));
 
    }

}