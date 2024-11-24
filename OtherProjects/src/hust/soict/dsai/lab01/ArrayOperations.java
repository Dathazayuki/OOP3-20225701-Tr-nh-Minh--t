package hust.soict.dsai.lab01;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử trong mảng
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        
        // Khởi tạo mảng
        double[] array = new double[n];

        // Nhập các phần tử của mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }

        // Sắp xếp mảng
        Arrays.sort(array);

        // Tính tổng và trung bình
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / n;

        // In kết quả
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));
        System.out.println("Tổng các phần tử: " + sum);
        System.out.println("Giá trị trung bình: " + average);

        scanner.close();
    }
}
