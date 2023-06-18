import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        double raio = scan.nextInt();
        double pi = 3.14159;

        double volume = (4/3.0) * pi * (Math.pow(raio, 3));

        System.out.println(String.format("VOLUME = %.3f", volume));
 
    }
 
}
