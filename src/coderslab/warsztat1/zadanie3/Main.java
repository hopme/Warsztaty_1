package coderslab.warsztat1.zadanie3;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        System.out.println("Pomysl liczbe od 1 do 1000 a ja zgadne w max. 10 probach");

        guessing();

    }

    private static void guessing() {

        int min = 0;
        int max = 1001;

        int guess = 0;

        // guess = (max - min) / 2   + min


            int i = 1;

        while (i <= 10) {

            guess = (max - min) / 2 + min;

            System.out.println("Proba nr: " + i++);
            System.out.println("Zgaduje. Szukana liczba to " + guess);
            System.out.println("Zgadlem? (mniej/wiecej/zgadles)");

            Scanner scan = new Scanner(System.in);
            String userInput = scan.nextLine();

            if (userInput.equals("mniej")) {

                max = guess;

            } else if (userInput.equals("wiecej")) {

                min = guess;

            } else if (userInput.equals("zgadles")) {

                System.out.println("Zgadles!");
                break;
            }

            if (i > 10) {
                System.out.println("proba nr" + i);
                System.out.println("NIe oszukuj!");
            }
        }
    }
}
