package bài4_lab1;
import java.util.Scanner;

public class Lab1Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        System.out.println("Delta = " + delta);

        if (delta >= 0) {
            double canDelta = Math.sqrt(delta);
            System.out.println("Căn delta = " + canDelta);
        } else {
            System.out.println("Delta âm, không có căn delta thực");
        }
    }
}
