package hust.soict.dsai.lab01;
import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What’s your name?");
        String strName = keyboard.nextLine();

        System.out.println("How old are you?");
        int age = keyboard.nextInt();

        System.out.println("How tall are you (m)?");
        double height = keyboard.nextDouble();

        // In thông tin đã nhập
        System.out.println("Mrs/Ms. " + strName + " is " + age + " years old.");
        System.out.println("Your height is " + height + " m.");

        keyboard.close();
    }
}