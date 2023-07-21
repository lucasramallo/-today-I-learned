import java.io.IOException;
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);

    String[] list = scan.nextLine().split(" ");

    List<Double> numbersList = new ArrayList();
    for (String e : list) {
      numbersList.add(Double.parseDouble(e));
    }

    Collections.sort(numbersList, Collections.reverseOrder());
    Double A = numbersList.get(0);
    Double B = numbersList.get(1);
    Double C = numbersList.get(2);

    if (A >= B + C) {
      System.out.println("NAO FORMA TRIANGULO");
    } else {
        if ((A * A) == ((B * B) + (C * C))) {
            System.out.println("TRIANGULO RETANGULO");
        } 
        if ((A * A) > ((B * B) + (C * C))) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } 
        if ((A * A) < ((B * B) + (C * C))) {
            System.out.println("TRIANGULO ACUTANGULO");
        } 
        
        if (A.equals(B) && B.equals(C)) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (A.equals(B) || B.equals(C) || A.equals(C)) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
  }
}

// import java.io.IOException;
// import java.util.Scanner;
// import java.util.Collections;
// import java.util.Arrays;
// import java.util.ArrayList;
// import java.util.List;

// public class Main {
//   public static void main(String[] args) throws IOException {
//     Scanner scan = new Scanner(System.in);

//     String[] list = scan.nextLine().split(" ");

//     List<Double> numbersList = new ArrayList();
//     for (String e : list) {
//       numbersList.add(Double.parseDouble(e));
//     }

//     Collections.sort(numbersList, Collections.reverseOrder());
//     Double A = numbersList.get(0);
//     Double B = numbersList.get(1);
//     Double C = numbersList.get(2);

//     if (A >= B + C) {
//       System.out.println("NAO FORMA TRIANGULO");
//     } else {
//         if ((A * A) == ((B * B) + (C * C))) {
//             System.out.println("TRIANGULO RETANGULO");
//         } 
//         if ((A * A) > ((B * B) + (C * C))) {
//             System.out.println("TRIANGULO OBTUSANGULO");
//         } 
//         if ((A * A) < ((B * B) + (C * C))) {
//             System.out.println("TRIANGULO ACUTANGULO");
//         } 
        
//         if (A == B && B == C) {
//             System.out.println("TRIANGULO EQUILATERO");
//         } else if (A.equals(B) || B.equals(C) || A.equals(C)) {
//             System.out.println("TRIANGULO ISOSCELES");
//         }
//     }
//   }
// }