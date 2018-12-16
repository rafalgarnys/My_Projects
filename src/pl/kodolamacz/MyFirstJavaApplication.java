package pl.kodolamacz;

import java.util.Scanner;

public class MyFirstJavaApplication {
    public static void main(String[] args) {
        System.out.println("Proszę podaj swoje imie:");

        Scanner scanner = new Scanner(System.in);

        String imie = scanner.nextLine();

        System.out.println("Proszę podaj swoje nazwisko:");

        String nazwisko = scanner.nextLine();
        scanner.close();

        System.out.println("witaj " + imie + " " + nazwisko);
    }
}
