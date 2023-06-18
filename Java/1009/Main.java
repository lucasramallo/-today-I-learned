import java.io.IOException;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String sellerName = scan.nextLine();
        double salary = scan.nextDouble();
        double sales = scan.nextDouble();

        double commission = sales * 0.15;
        double total = salary + commission;

        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}