import javax.swing.JOptionPane;

public class convertIntoDouble {
    public static void main(String[] args) {

          String strNum1 = JOptionPane.showInputDialog(null, "Nhap so thu nhat:", "Nhap so", JOptionPane.INFORMATION_MESSAGE);
          double num1 = Double.parseDouble(strNum1);

          String strNum2 = JOptionPane.showInputDialog(null, "Nhap so thu hai:", "Nhap so", JOptionPane.INFORMATION_MESSAGE);
          double num2 = Double.parseDouble(strNum2);

          String result = "Ket qua :\n";
          result += "Tong: " + (num1 + num2) + "\n";
          result += "Hieu: " + (num1 - num2) + "\n";
          result += "Tich: " + (num1 * num2) + "\n";

          if (num2 != 0) {
              result += "Thuong: " + (num1 / num2);
          } else {
              result += "Khong the chia cho 0";
          }
          JOptionPane.showMessageDialog(null, result, "Ket qua tinh toan", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}