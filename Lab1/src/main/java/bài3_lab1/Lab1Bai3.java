package bài3_lab1;
import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh lập phương: ");
        double canh = scanner.nextDouble();

        double theTich = Math.pow(canh, 3);

        System.out.println("Thể tích lập phương: " + theTich);
    }
}
