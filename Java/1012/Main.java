import java.io.IOException;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws IOException {
    
        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();

        double areaDTriangulRetanguloareaDTriangulRetangulo = (A * C) / 2;

        System.out.println(String.format("Area: %.2f", areaDTriangulRetanguloareaDTriangulRetangulo));

 
    }
 
}

//3.0 4.0 5.2