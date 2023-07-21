import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
 
        String linha1 = scan.nextLine();
        
        String[] list = linha1.split(" ");
        float n1 = Float.parseFloat(list[0]);
        float n2 = Float.parseFloat(list[1]);
        float n3 = Float.parseFloat(list[2]);
        float n4 = Float.parseFloat(list[3]);

        float media = ((n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10);

        System.out.println(String.format("Media: %.1f", media));

        if(media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if(media < 5) {
            System.out.println("Aluno reprovado.");
        } else if(media >= 5 && media < 6) {
            Float notaExame = Float.parseFloat(scan.nextLine());

            float mediaFinal = ((media + notaExame) / 2);

            System.out.println("Aluno em exame.");
            System.out.println(String.format("Nota do exame: %.1f", notaExame));

            if(mediaFinal > 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.println(String.format("Media final: %.1f", mediaFinal));
        }
    }
 
}



// import java.io.IOException;
// import java.util.Scanner;
// import java.io.File;

// public class Main {
//     public static void main(String[] args) throws IOException {
//         File file = new File("/ARQUIVOS/PROGRAMAR/TodayILearned/Java/1040/input.txt");
//         Scanner scan = new Scanner(file);
 
//         String linha1 = scan.nextLine();
        
//         String[] list = linha1.split(" ");
//         float n1 = Float.parseFloat(list[0]);
//         float n2 = Float.parseFloat(list[1]);
//         float n3 = Float.parseFloat(list[2]);
//         float n4 = Float.parseFloat(list[3]);

//         float media = ((n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10);

//         System.out.println(String.format("Media: %.1f", media));

//         if(media >= 7) {
//             System.out.println("Aluno aprovado.");
//         } else if(media < 5) {
//             System.out.println("Aluno reprovado.");
//         } else if(media >= 5 && media < 6) {
//             Float notaExame = Float.parseFloat(scan.nextLine());

//             float mediaFinal = ((media + notaExame) / 2);

//             System.out.println("Aluno em exame.");
//             System.out.println(String.format("Nota do exame: %.1f", notaExame));

//             if(mediaFinal > 5) {
//                 System.out.println("Aluno aprovado.");
//             } else {
//                 System.out.println("Aluno reprovado.");
//             }

//             System.out.println(String.format("Media final: %.1f", mediaFinal));
//         }
//     }
 
// }