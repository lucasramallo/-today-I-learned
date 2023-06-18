import java.io.IOException;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int employeeNumber = scan.nextInt();
        int hours = scan.nextInt();
        double valuePerHour = scan.nextDouble();

        double salary = hours * valuePerHour;

        System.out.printf("NUMBER = %d\n", employeeNumber);
        System.out.printf("SALARY = U$ %.2f\n", salary);

    }
}
