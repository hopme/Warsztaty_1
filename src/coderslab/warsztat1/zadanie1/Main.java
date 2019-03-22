package coderslab.warsztat1.zadanie1;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {


        int number = randomNumber(50);
        System.out.println(number);
        System.out.println("Zgadnij liczbe");
        Scanner scanner = new Scanner(System.in);



            while (scanner.hasNext()) {
                try {
                    int scanNumber = scanner.nextInt();
                    if (scanNumber < number) {
                        System.out.println("Za malo!");
                    } else if (scanNumber > number) {
                        System.out.println("Za duzo");
                    } else {
                        System.out.println("Zgadles!");
                        break;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("To nie jest liczba");
                    scanner.next();
                }

            }
    }

    static int randomNumber(int max) {

        Random rand = new Random();

        // Obtain a number between [0 - 49].
        int n = rand.nextInt(max);

        // Add 1 to the result to get a number from the required range
        // (i.e., [1 - 50]).
        n += 1;

        return n;
    }

}
