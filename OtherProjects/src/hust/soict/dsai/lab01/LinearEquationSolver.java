//Example 2.2.6 : Hệ phương trình 2 ẩn
package hust.soict.dsai.lab01;

import java.util.Scanner;

public class LinearEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập các tham số
        System.out.print("Nhập a1: ");
        double a1 = scanner.nextDouble();
        System.out.print("Nhập b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Nhập c1: ");
        double c1 = scanner.nextDouble();
        System.out.print("Nhập a2: ");
        double a2 = scanner.nextDouble();
        System.out.print("Nhập b2: ");
        double b2 = scanner.nextDouble();
        System.out.print("Nhập c2: ");
        double c2 = scanner.nextDouble();

        // Tính định thức D
        double D = a1 * b2 - a2 * b1;

        if (D != 0) {
            // Hệ có nghiệm duy nhất
            double x = (c1 * b2 - c2 * b1) / D;
            double y = (a1 * c2 - a2 * c1) / D;
            System.out.printf("Nghiệm của hệ phương trình là: x = %.2f, y = %.2f%n", x, y);
        } else {
            // Kiểm tra điều kiện vô số nghiệm hoặc vô nghiệm
            double D1 = c1 * b2 - c2 * b1;
            double D2 = a1 * c2 - a2 * c1;

            if (D1 == 0 && D2 == 0) {
                System.out.println("Hệ phương trình có vô số nghiệm.");
            } else {
                System.out.println("Hệ phương trình vô nghiệm.");
            }
        }

        scanner.close();
    }
}
