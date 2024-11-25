import java.util.Scanner;
public class arrSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so hang cua ma tran: ");
        int rows = scanner.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int cols = scanner.nextInt();
        
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result = new int[rows][cols];
        
        System.out.println("Nhap cac phan tu cho ma tran thu nhat:");
        inputMatrix(scanner, matrix1);
        
        System.out.println("Nhap cac phan tu cho ma tran thu hai:");
        inputMatrix(scanner, matrix2);
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        System.out.println("Ket qua cong hai ma tran la:");
        printMatrix(result);
        
        scanner.close();
    }
    
    public static void inputMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("Nhap phan tu [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    
    public static void printMatrix(int[][] matrix) {
      for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix[0].length; j++) {
              System.out.print(matrix[i][j] + " ");
          }
          System.out.println();
      }
  }
}