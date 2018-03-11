package pl.edu.ur.main;

/**
 *
 * @author Lamar
 */
import java.util.*;

public class Main {

    int suma(int tablica[]) {
        int suma = 0;

        for (int i = 0; i <= 9; i++) {
            suma = suma + tablica[i];
        }
        return suma;
    }

    int iloczyn(int tablica[]) {
        int iloczyn = 1;
        for (int i = 0; i <= 9; i++) {
            iloczyn = iloczyn * tablica[i];
        }
        return iloczyn;
    }

    void min(int tab[]) {
        int min = tab[0];
        for (int i = 0; i < 9; i++) {
            if (tab[i] < min) {
                min = tab[i];

            }
        }
        System.out.println("Najmniejszy element w tej tablicy to: " + min);
    }

    void max(int tab[]) {
        int max = tab[0];
        for (int i = 0; i < 9; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }

        }
        System.out.println("Najwiekszy element tej tablicy to: " + max);
    }

    void bubble(int tab[]) {
        int n = tab.length;
    int temp = 0;

    for (int i = 0; i < n; i++) {
        for (int j = 1; j < (n - i); j++) {

            if (tab[j - 1] > tab[j]) {
                temp = tab[j - 1];
                tab[j - 1] = tab[j];
                tab[j] = temp;
            }

        }
    }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj numer zadania ze zbioru z={3,4,6,7}");
        int z = in.nextInt();
        switch (z) {
            case 3: {
                double tab[] = new double[10];
                System.out.println("Podaj dziesiec liczb dla ktorych zostanie wykonane zadanie 3");
                for (int i = 0; i <= 9; i++) {
                    tab[i] = in.nextDouble();
                }
                System.out.println("Teraz podaj ktora operacje wykonac: 1- wyswietlanie elementow tablicy od pierwszego do ostatniego indeksu 2- Wyswietlanie elementow tablicy od ostatniego do pierwszego indeksu 3- Wyswietlanie elementow o nieparzystych indeksach 4 - Wyswietlanie elementow o parzystych indeksach ");
                int operacja = in.nextInt();
                switch (operacja) {
                    case 1: {
                        System.out.println("a) wyswietlanie elementow tablicy od pierwszego do ostatniego indeksu");
                        for (int j = 0; j <= 9; j++) {
                            System.out.println(tab[j]);
                        }
                        break;

                    }
                    case 2: {
                        System.out.println("b) Wyswietlanie elementow tablicy od ostatniego do pierwszego indeksu");
                        for (int k = 9; k >= 0; k--) {
                            System.out.println(tab[k]);
                        }
                        break;

                    }
                    case 3: {
                        System.out.println("c) Wyswietlanie elementow o nieparzystych indeksach");
                        for (int l = 0; l <= 9; l++) {
                            if (l % 2 != 0) {
                                System.out.println(tab[l]);
                            }
                        }
                        break;

                    }
                    case 4: {
                        System.out.println("d) Wyswietlanie elementow o parzystych indeksach");
                        for (int m = 0; m <= 9; m++) {
                            if (m % 2 == 0) {
                                System.out.println(tab[m]);
                            }
                        }
                        break;

                    }
                    default: {
                        System.out.println("Nieprawidlowy numer operacji");
                        break;

                    }
                }
                break;

            }
            case 4: {

                int tablica[] = new int[10];
                System.out.println("Podaj 10 elementow tablicy");
                for (int i = 0; i <= 9; i++) {
                    tablica[i] = in.nextInt();
                }
                Main zad4 = new Main();
                System.out.println("Teraz podaj ktora operacje wykonac: 1 - oblicza sume elementow tablicy, 2 - oblicza iloczyn elementow tablicy, 3/4 ustala odpowiednio najwiekszy i najmniejszy element tablicy, 5 - srednia elementow tablicy");
                int z4op = in.nextInt();
                switch (z4op) {

                    case 1: {
                        System.out.println("Suma elementów tablicy wynosi: " + zad4.suma(tablica));
                        break;
                    }
                    case 2: {
                        System.out.println("Iloczyn elementów tablicy wynosi: " + zad4.iloczyn(tablica));
                        break;

                    }
                    case 3: {
                        zad4.max(tablica);
                        break;

                    }
                    case 4: {
                        zad4.min(tablica);
                        break;

                    }
                    case 5: {
                        System.out.println("Srednia elementow tej tablicy to: " + (zad4.suma(tablica) / 10));
                        break;

                    }

                }
                break;
            }
            case 6: {
                while (true) {
                    System.out.println("Podaj liczbe calkowita");
                    int i = in.nextInt();
                    if (i < 0) {
                        break;
                    }
                }
            }
            case 7: {
                System.out.println("Podaj ile liczb wprowadzisz do tablicy");
                int n = in.nextInt();
                int tab[] = new int[n];
                System.out.println("Teraz podaj wszystkie te liczby");
                for (int i = 0; i < n; i++) {
                    tab[i] = in.nextInt();
                }
               Main zad7 = new Main();
                zad7.bubble(tab);
                System.out.println("Posortowane elementy to: ");
                for (int j = 0; j < n; j++) {
                    System.out.println(tab[j]);
                }

            }

        }
    }

}
