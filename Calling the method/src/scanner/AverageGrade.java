package scanner;

import java.util.Locale;
import java.util.Scanner;

public class AverageGrade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        int numberOfClasses = 5;
        int numberOfGrades = 4;
        int sumarized = 0;

        for(int classIndex = 0; classIndex < numberOfClasses; classIndex++) {

            System.out.println("Number of class " + classIndex);

            for(int gradesIndeks = 0; gradesIndeks < numberOfGrades; gradesIndeks++) {
                System.out.println("Give grade " + gradesIndeks + " from class " + classIndex);
                int number = scanner.nextInt();

                sumarized += number;
                System.out.println(sumarized);

                if(gradesIndeks == (numberOfGrades - 1)) {
                    double averageGrade = (double)sumarized / numberOfGrades;
                    System.out.println("Your average grade of class " + classIndex + " is " + averageGrade);
                    sumarized = 0;
                }
            }

        }
    }
}
