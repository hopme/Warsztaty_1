package coderslab.warsztat1.zadanie2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {


        checkUseWin(getNumbersFromUser(), getRandomNumbers());

    }

    private static int[] getNumbersFromUser() {


        System.out.println("Podaj 6 liczb z zakresu 1 - 49");
        Scanner scanner = new Scanner(System.in);
        int []numbers = new int[6];
        int index = 0;

        while(index < 6) {

            System.out.println("Podaj liczbe");
            while(!scanner.hasNextInt()){
                scanner.nextLine();
            }
            int userNumber = scanner.nextInt();
            boolean sameNumber = false;

            for (int i =0 ; i < index; i++) {
                if (numbers[i] == userNumber) {
                    sameNumber = true;
                    break;
                }
            }

            if (sameNumber == false && userNumber >= 1 && userNumber <= 49) {
                numbers[index] = userNumber;
                index++;
            } else {
                System.out.println("Liczba niepoprawna");
            }
        }

        return numbers;

    }

    private static Integer[] getRandomNumbers() {

        Integer[] arr = new Integer[49];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        Collections.shuffle(Arrays.asList(arr));
        return Arrays.copyOf(arr, 6); // chcemy tylko 6 pi
    }

    private static void checkUseWin (int[] userNumbers, Integer[] randomNumbers) {

        int count = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (userNumbers[i] == randomNumbers[j]) {
                    count++;
                }
            }
        }

        if (count > 3) {
            System.out.println("Gratulacje! Trafiles: " + count + " liczb");
        } else {
            System.out.println("Niestety nie trafiles zadnej liczby :(");

        }
    }
}