import java.util.Scanner;

public class dayofmonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year, month, day;

        while (true) {
          System.out.print("Nhap nam : ");
          String yearstr = scanner.nextLine();

          System.out.print("Nhap thang trong nam : ");
          String monthstr = scanner.nextLine();

          if (isValidYear(yearstr)) {
              year = Integer.parseInt(yearstr);
              month = getMonth(monthstr);

              if (month != -1) {
                  day = getDaysInMonth(month, year);
                  System.out.printf("Thang %d nam %d co %d ngay", month, year, day);
                  break;
              } else {
                  System.out.println("Thang khong hop le, vui long nhap lai !");
              }
          } else {
              System.out.println("Nam khong hop le, vui long nhap lai !");
          }
      }

        scanner.close();
    }

    private static boolean isValidYear(String yearInput) {
        return yearInput.matches("\\d{4}") && Integer.parseInt(yearInput) >= 0;
    }

    private static int getMonth(String monthInput) {
        String[] month1 = {"January", "February", "March", "April", "May", "June", 
                               "July", "August", "September", "October", "November", "December"};
        String[] month2 = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", 
                                       "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] month3 = {"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", 
        "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
        String[] month4 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};

        for (int i = 0; i < 12; i++) {
            if (monthInput.equals(month1[i]) || 
                monthInput.equals(month2[i]) || 
                monthInput.equals(month3[i]) || 
                monthInput.equals(month4[i])) {
                    return i + 1;
            }
        }
        return -1;
    }

    private static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0) || ((year % 100 != 0)&&(year % 400 == 0));
    }
}