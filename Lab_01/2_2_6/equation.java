import javax.swing.JOptionPane;

public class equation {
  public static void main(String[] args) {
    int tmp;

    do{
      JOptionPane.showMessageDialog(null, "Hay chon loai phuong trinh : \n 1. Phuong trinh bac nhat \n 2. Phuong trinh bac nhat hai an \n 3. Phuong trinh bac hai \n 0. Thoat");

      String choiceStr = JOptionPane.showInputDialog(null, "Vui long nhap lua chon :", "Lua chon cua ban", JOptionPane.INFORMATION_MESSAGE);
      int choice = Integer.parseInt(choiceStr);
      tmp = choice;

      switch (choice) {
        case 1:
            first_degree_equation();
            break;
        case 2:
            first_degree_equation_twovar();
            break;
        case 3:
            second_degree_equation();
            break;
        case 0:
            System.out.println("OK!");
            break;
        default:
            System.out.println("Khong hop le, hay thu lai!");
    }
    }
    while(tmp != 0 );
    
  }

  public static void first_degree_equation() {
    String stra, strb;
    JOptionPane.showMessageDialog(null, "Giai phuong Trinh bac nhat ax + b = 0");

    stra = JOptionPane.showInputDialog(null, "Vui long nhap so a:", "Nhap so a", JOptionPane.INFORMATION_MESSAGE);
    double a = Double.parseDouble(stra);

    strb = JOptionPane.showInputDialog(null, "Vui long nhap so b:", "Nhap so b", JOptionPane.INFORMATION_MESSAGE);
    double b = Double.parseDouble(strb);
    
    String result;

    if (a == 0) {
        if (b == 0) {
            result = "Phuong trinh co vo so nghiem.";
        } else {
            result = "Phuong trinh vo nghiem.";
        }
    } else {
        double x = -b / a;
        result = String.format("Nghiem cua phuong trinh la: x = %.2f", x);
    }
    
    JOptionPane.showMessageDialog(null, result, "Ket qua", JOptionPane.INFORMATION_MESSAGE);
}

public static void first_degree_equation_twovar() {
  String stra11, stra12, strb1, stra21, stra22, strb2;
  JOptionPane.showMessageDialog(null, "Giai he phuong trinh bac nhat hai an:\n𝑎11𝑥1 + 𝑎12𝑥2 = 𝑏1\n𝑎21𝑥1 + 𝑎22𝑥2 = 𝑏2");

  stra11 = JOptionPane.showInputDialog(null, "Nhap so a11:", "Nhap a11", JOptionPane.INFORMATION_MESSAGE);
  double a11 = Double.parseDouble(stra11);

  stra12 = JOptionPane.showInputDialog(null, "Nhap so a12:", "Nhap a12", JOptionPane.INFORMATION_MESSAGE);
  double a12 = Double.parseDouble(stra12);

  strb1 = JOptionPane.showInputDialog(null, "Nhap so b1:", "Nhap b1", JOptionPane.INFORMATION_MESSAGE);
  double b1 = Double.parseDouble(strb1);

  stra21 = JOptionPane.showInputDialog(null, "Nhap so a21:", "Nhap a21", JOptionPane.INFORMATION_MESSAGE);
  double a21 = Double.parseDouble(stra21);

  stra22 = JOptionPane.showInputDialog(null, "Nhap so a22:", "Nhap a22", JOptionPane.INFORMATION_MESSAGE);
  double a22 = Double.parseDouble(stra22);

  strb2 = JOptionPane.showInputDialog(null, "Nhap so b2:", "Nhap b2", JOptionPane.INFORMATION_MESSAGE);
  double b2 = Double.parseDouble(strb2);

  double D = a11 * a22 - a21 * a12;
  double D1 = b1 * a22 - b2 * a12;
  double D2 = a11 * b2 - a21 * b1;

  String result;

  if (D == 0) {
      if (D1 == 0 && D2 == 0) {
          result = "He phuong trinh co vo so nghiem.";
      } else {
          result = "He phuong trinh vo nghiem.";
      }
  } else {
      double x1 = D1 / D;
      double x2 = D2 / D;
      result = String.format("Nghiem cua he phuong trinh la:\nx1 = %.2f\nx2 = %.2f", x1, x2);
  }

  JOptionPane.showMessageDialog(null, result, "Ket qua", JOptionPane.INFORMATION_MESSAGE);
}

public static void second_degree_equation() {
  String stra, strb, strc;
  JOptionPane.showMessageDialog(null, "Giai phuong trinh bac hai ax^2 + bx + c = 0");

  stra = JOptionPane.showInputDialog(null, " Please input number a: ", "Input number a", JOptionPane.INFORMATION_MESSAGE);
  double a = Double.parseDouble(stra);

  strb = JOptionPane.showInputDialog(null, " Please input number b: ", "Input number b", JOptionPane.INFORMATION_MESSAGE);
  double b = Double.parseDouble(strb);

  strc = JOptionPane.showInputDialog(null, " Please input number b: ", "Input number b", JOptionPane.INFORMATION_MESSAGE);
  double c = Double.parseDouble(strc);
  
  String result;

  double delta = b * b - 4 * a * c;
  if (delta > 0) {
      double x1 = (-b + Math.sqrt(delta)) / (2 * a);
      double x2 = (-b - Math.sqrt(delta)) / (2 * a);
      result = String.format("Phuong trinh co hai nghiem phan biet:\nx1 = %.2f\nx2 = %.2f", x1, x2);
  } else if (Math.abs(delta) < 0) {
      double x = -b / (2 * a);
      result = String.format("Phuong trinh co nghiem kep: x = %.2f", x);
  } else {
      result = "Phuong trinh vo nghiem trong tap so thuc.";
  }
  
  JOptionPane.showMessageDialog(null, result, "Ket qua", JOptionPane.INFORMATION_MESSAGE);
}

}