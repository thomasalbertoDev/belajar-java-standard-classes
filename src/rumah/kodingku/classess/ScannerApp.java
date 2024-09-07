package rumah.kodingku.classess;

import java.util.Scanner;

public class ScannerApp {

    public static void main(String[] args) {
        // Scanner class digunakan untuk membaca input dari user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

    }
}
