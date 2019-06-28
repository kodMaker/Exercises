package Computation;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication();
            System.out.println("Wykonujesz mnożenie. Podaj dwie liczby pojedyńczo zatwierdzając Enterem");
        }
        else {
            computation = new Addition();
            System.out.println("Wykonujesz dodawanie. Podaj dwie liczby pojedyńczo zatwierdzając Enterem");

        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Co chcesz zrobić? Jeśli chcesz wykonać mnożenie wciśnij m i zatwierdź Enter, każdy inny wpisany i zatwierdzony znak wykona dodawanie");
        return scanner.next().equals("m");
    }

    private double getArgument() {
        System.out.println("Podaj liczbę");
        return scanner.nextInt();
    }
}