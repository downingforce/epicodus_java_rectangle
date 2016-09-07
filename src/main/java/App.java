import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter the length of your rectangle:");
    String stringLength = myConsole.readLine();
    int intLength = Integer.parseInt(stringLength);
  }
}
