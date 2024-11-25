import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String[] args) {
      Scanner keyborad = new Scanner(System.in);

      System.out.println("What your name?");
      String strName = keyborad.nextLine();

      System.out.println("How old are you?");
      int iAge = keyborad.nextInt();

      System.out.println("How tall are you? (m)");
      double dHeight = keyborad.nextDouble();
      
      System.out.println("Mrs/Ms. " + strName + ", " + iAge + " years old. " + "Your height is " + dHeight + ".");

      System.exit(0);
    }
}