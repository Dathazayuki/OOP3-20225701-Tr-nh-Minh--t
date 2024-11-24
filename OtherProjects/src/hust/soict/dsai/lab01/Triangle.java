//BT6.3
package hust.soict.dsai.lab01;

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều cao tam giác
        System.out.print("Nhập chiều cao của tam giác (n): ");
        int n = scanner.nextInt();

        // Vẽ tam giác
        for (int i = 0; i < n; i++) {
            // In khoảng trắng trước mỗi hàng
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // In sao
        for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            // Xuống dòng sau mỗi hàng
            System.out.println();
        }
        scanner.close();
    }
}