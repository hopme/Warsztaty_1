package coderslab.warsztat1.zadanie4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        //xDy+z - schemat rzutu kostka

        System.out.println("Rzuc koscmi(np 2D10+20):");
        Scanner scanner = new Scanner(System.in);
        String roll = scanner.nextLine().toLowerCase();

        String[] tab = roll.split("d");

        int times = 1; //liczba rzutow 'x'
        if (tab[0].length() > 0) {
            times = Integer.parseInt(tab[0]);
        }

        String[] modificationplus = tab[1].split("\\+"); // jesli dodanie 'z'
        String[] modificationminus = tab[1].split("-"); // jesli odjecie 'z'

        int modification = 0; //modyfikacja czyli z
        int cube = 0; // ile scian
        if (modificationplus[1].length() > 0) {
            modification = Integer.parseInt(modificationplus[1]); //[1] czyli po prawej stornie tablicy
            cube = Integer.parseInt(modificationplus[0]);
            } else if (modificationminus[1].length() > 0) {
                modification = Integer.parseInt(modificationminus[1]) * (-1); // by odzyskac minus to mnozymy * -1
        }

        System.out.println("rzuce: " + times + " razy kostka: " + cube + "");


        int result = 0;

        Random rand = new Random();
        for (int i = 0; i < times; i++){
                int probe = rand.nextInt(cube) + 1;
                System.out.println("Rzucilem: " + probe);
                result+= probe;
        }

        result = result + modification;
        System.out.println("Wynik: " + result);

    }
}
