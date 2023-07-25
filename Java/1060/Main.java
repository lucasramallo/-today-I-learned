import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int counter = 0;
        Double media = 0.0;

        for(int i = 0; i < 6; i++){
            Double number = scan.nextDouble();

            if(number > 0) {
                counter++;
                media += number;
            }
        }

        System.out.println(String.format("%d valores positivos", counter));
        System.out.println(String.format("%.1f", media / counter));
    }
}