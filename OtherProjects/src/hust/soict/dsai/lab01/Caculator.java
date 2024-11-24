//Example 2.2.5 
package hust.soict.dsai.lab01;

import java.util.Scanner;
public class Caculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        double num1 = scanner.nextDouble();

        System.out.print("Nhập số thứ hai: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient;

        if (num2 != 0) {
            quotient = num1 / num2;
        } else {
            quotient = Double.NaN; // Không xác định
        }

        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + difference);
        System.out.println("Tích: " + product);
        
        if (num2 != 0) {
            System.out.println("Thương: " + quotient);
        } else {
            System.out.println("Thương: không xác định (chia cho 0)");
        }

        scanner.close();
    }
}

