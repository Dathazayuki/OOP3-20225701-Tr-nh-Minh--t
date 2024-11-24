//Example 2.2.6: pt bậc 2
package hust.soict.dsai.lab01;

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập các tham số
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        // Kiểm tra giá trị của a
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                // Phương trình bậc nhất
                double x = -c / b;
                System.out.printf("Nghiệm của phương trình là: x = %.2f%n", x);
            }
        } else {
            // Tính delta
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                // Hai nghiệm phân biệt
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Hai nghiệm của phương trình là: x1 = %.2f, x2 = %.2f%n", x1, x2);
            } else if (delta == 0) {
                // Một nghiệm duy nhất
                double x = -b / (2 * a);
                System.out.printf("Nghiệm của phương trình là: x = %.2f%n", x);
            } else {
                // Không có nghiệm thực
                System.out.println("Phương trình vô nghiệm thực.");
            }
        }

        scanner.close();
    }
}