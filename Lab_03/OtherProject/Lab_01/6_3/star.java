import java.util.Scanner;
public class star {
  public static void main(String[] args) {
    Scanner keyborad = new Scanner(System.in);
    
    System.out.println("height of stars?");
    int n = keyborad.nextInt();

    for(int i = 0; i < n; i++){
      for(int k = n - i; k > 0; k--){
        System.out.print(" ");
      }
      for(int j = 2*i+1; j > 0; j--){
        System.out.print("*");
      }
      System.out.println();
  }
  }
}
