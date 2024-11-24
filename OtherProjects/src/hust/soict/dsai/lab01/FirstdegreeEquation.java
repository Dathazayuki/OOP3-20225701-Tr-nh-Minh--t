//Example 2.2.6 : Phương trình bậc nhất
package hust.soict.dsai.lab01;

import java.util.Scanner;
public class FirstdegreeEquation {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Nhập các tham số
	        System.out.print("Nhập a: ");
	        double a = scanner.nextDouble();
	        System.out.print("Nhập b: ");
	        double b = scanner.nextDouble();

	        // Kiểm tra các trường hợp
	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình có vô số nghiệm.");
	            } else {
	                System.out.println("Phương trình vô nghiệm.");
	            }
	        } else {
	            // Tính nghiệm
	            double x = -b / a;
	            System.out.printf("Nghiệm của phương trình là: x = %.2f%n", x);
	        }

	        scanner.close();
	    }
	}
