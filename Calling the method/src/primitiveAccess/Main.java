package primitiveAccess;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        checkNames();
    }

    private String[] nameBatabase = {"Radek", "Agata", "Jacek", "Piotr", "Emil", "Grzegorz", "Monika"};
    private String[] passwordBatabase = {"a1", "a2", "a3", "a4", "a5", "a6", "mam.fajne.cyce"};

    public String[] getNameBatabase() {
        return nameBatabase;
    }

    public String[] getPasswordBatabase() {
        return passwordBatabase;
    }


    private static void checkNames() {
        Scanner scan = new Scanner(System.in);
        Main main = new Main();

        System.out.println("Podaj imie");
        String name = scan.nextLine();

        for(int i = 0; i < main.getNameBatabase().length; i++) {
            if(name.equals(main.getNameBatabase()[i])) {
                System.out.println("Cześć " + main.getNameBatabase()[i]);

                if(checkPassword(main.getNameBatabase()[i], i) == true) {
                    System.out.println("Hasło prawidłowe " + main.getNameBatabase()[i] + ", Otrzymujesz dostęp");
                    System.exit(0);
                }
            }else
                continue;
        }
        System.out.println("Nie znam Cię, brak dostępu");
    }

    private static boolean checkPassword(String name, int i){
        Scanner scanPassword = new Scanner(System.in);
        Main main = new Main();

        String nameToUnlock = name;
        int possitionName = i;

        System.out.println("Podaj hasło " + name);
        String password = scanPassword.nextLine();

        if(password.equals(main.getPasswordBatabase()[i]))
            return true;

        return false;
    }
}
