import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int horaInicial = scan.nextInt();
        int minutoInicial = scan.nextInt();
        int horaFinal = scan.nextInt();
        int minutoFinal = scan.nextInt();

        int totalMinutosInicial = horaInicial * 60 + minutoInicial;
        int totalMinutosFinal = horaFinal * 60 + minutoFinal;

        int duracaoMinutos;
        if (totalMinutosFinal > totalMinutosInicial) {
            duracaoMinutos = totalMinutosFinal - totalMinutosInicial;
        } else {
            duracaoMinutos = (24 * 60) - totalMinutosInicial + totalMinutosFinal;
        }

        int duracaoHoras = duracaoMinutos / 60;
        duracaoMinutos %= 60;

        System.out.println(String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", duracaoHoras, duracaoMinutos));
    }
}
