package hust.soict.dsai.lab01;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> monthMap = new HashMap<>();
        monthMap.put("January", 1);
        monthMap.put("February", 2);
        monthMap.put("March", 3);
        monthMap.put("April", 4);
        monthMap.put("May", 5);
        monthMap.put("June", 6);
        monthMap.put("July", 7);
        monthMap.put("August", 8);
        monthMap.put("September", 9);
        monthMap.put("October", 10);
        monthMap.put("November", 11);
        monthMap.put("December", 12);
        monthMap.put("Jan", 1);
        monthMap.put("Feb", 2);
        monthMap.put("Mar", 3);
        monthMap.put("Apr", 4);
        monthMap.put("May", 5);
        monthMap.put("Jun", 6);
        monthMap.put("Jul", 7);
        monthMap.put("Aug", 8);
        monthMap.put("Sep", 9);
        monthMap.put("Oct", 10);
        monthMap.put("Nov", 11);
        monthMap.put("Dec", 12);
        monthMap.put("Jan.", 1);
        monthMap.put("Feb.", 2);
        monthMap.put("Mar.", 3);
        monthMap.put("Apr.", 4);
        monthMap.put("May.", 5);
        monthMap.put("Jun.", 6);
        monthMap.put("Jul.", 7);
        monthMap.put("Aug.", 8);
        monthMap.put("Sep.", 9);
        monthMap.put("Oct.", 10);
        monthMap.put("Nov.", 11);
        monthMap.put("Dec.", 12);



        while (true) {
            // Nhập tháng
            System.out.print("Nhập tháng (tên đầy đủ, viết tắt, hoặc số): ");
            String monthInput = scanner.nextLine().trim();
            int month = getMonth(monthInput, monthMap);

            if (month == -1) {
                System.out.println("Tháng không hợp lệ. Vui lòng nhập lại.");
                continue;
            }

            // Nhập năm
            System.out.print("Nhập năm (số không âm): ");
            int year = getYear(scanner);

            // Tính số ngày trong tháng
            int daysInMonth = getDaysInMonth(month, year);
            System.out.println("Số ngày trong tháng " + monthInput + " năm " + year + ": " + daysInMonth);
            break;
        }

        scanner.close();
    }

    private static int getMonth(String monthInput, Map<String, Integer> monthMap) {
        // Kiểm tra xem đầu vào có phải là số hay không
        try {
            int month = Integer.parseInt(monthInput);
            if (month >= 1 && month <= 12) {
                return month;
            }
        } catch (NumberFormatException e) {
            // Không phải số
        }

        // Kiểm tra xem đầu vào có hợp lệ với tên tháng hoặc viết tắt không
        String monthKey = monthInput.substring(0, Math.min(monthInput.length(), 3)).toLowerCase();
        for (Map.Entry<String, Integer> entry : monthMap.entrySet()) {
            if (entry.getKey().toLowerCase().startsWith(monthKey)) {
                return entry.getValue();
            }
        }

        return -1; // Tháng không hợp lệ
    }

    private static int getYear(Scanner scanner) {
        int year = -1;
        while (true) {
            try {
                year = Integer.parseInt(scanner.nextLine().trim());
                if (year >= 0) {
                    break;
                } else {
                    System.out.println("Năm phải là số không âm. Vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Năm không hợp lệ. Vui lòng nhập lại.");
            }
        }
        return year;
    }

    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0; 
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}