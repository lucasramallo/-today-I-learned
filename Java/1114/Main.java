import java.io.IOException;
import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) throws IOException {
    boolean run = true;
    Scanner scan = new Scanner(System.in);

    while(run) {
      String password = scan.nextLine(); 
      
      boolean isAuth = auth(password);

      if(isAuth == true) {
        System.out.println("Acesso Permitido");
        run = false;
      } else {
        System.out.println("Senha Invalida");
      }
    }
    scan.close();
  }

  public static boolean auth(String pass) {
    if(pass.equals("2002")) {
      return true;
    } 
    return false;
  }
}