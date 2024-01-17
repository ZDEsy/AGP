package Tests;

import java.util.Scanner;

public class Test01 {
    /*
    Rozpoznání Znaku
    Téma: Vìtvení programu

    Procvièované uèivo: Vìtvení if, vìtvení switch, základní vstup a výstup v Javì

    Zadání:
    Napište program v jazyku Java, který naète od uživatele jeden znak a slovnì popíše, o jaký znak se jedná.
    Pokud je zadaný znak malé písmeno (napø. 'a' až 'z'), program vypíše "male pismeno" následované tímto znakem.
    Pokud je zadaný znak velké písmeno (napø. 'A' až 'Z'), program vypíše "velke pismeno" následované tímto znakem.
    Pokud je zadaný znak èíslice (napø. '0' až '9'), program vypíše "cislice" následované touto èíslicí.
    Pro speciální znaky "!", "?", "*", "@", "#", "^" program vypíše odpovídající text: "vykricnik", "otaznik",
    "hvezdicka", "zavinac", "krizek", "striska".
    Pro všechny ostatní znaky program vypíše "jiny znak".
    Pøíklad výstupu:
    Zadejte znak: c
    Zadany znak je: male pismeno c
     */
    public static void characterRecognition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadejte znak: ");
        char character = scanner.nextLine().charAt(0);
        System.out.print("Zadany znak je: ");
        if(character >= 65 && character <= 90)
        {
            System.out.print("velke pismeno " + character);
        } else if (character >= 97 && character <= 122) {
            System.out.print("male pismeno " + character);
        } else if (character >= 48 && character <= 59) {
            System.out.print("cislice " + character);
        } else {
            switch (character)
            {
                case '!':
                    System.out.print("vykricnik");
                    break;
                case '?':
                    System.out.print("otaznik");
                    break;
                case '*':
                    System.out.print("hvezdicka");
                    break;
                case '@':
                    System.out.print("zavinac");
                    break;
                case '#':
                    System.out.print("krizek");
                    break;
                case '^':
                    System.out.print("striska");
                    break;
                default:
                    System.out.print("jiny znak");
                    break;
            }
        }


    }
    /*
    Urèení Nejvìtšího Èísla z Trojice
    Téma: Vìtvení programu

    Procvièované uèivo: Vìtvení if, základní vstup a výstup v Javì

    Zadání:
    Napište program v jazyku Java, který od uživatele naète tøi celá èísla a urèí, které z nich je nejvìtší.
    Výsledek pak vypíše na obrazovku. Program by mìl nejprve vyzvat uživatele, aby postupnì zadával tøi èísla.
    Poté by mìl použít vìtvení if k porovnání tìchto èísel a urèení nejvìtšího z nich.
    Nakonec by mìl vypsat nejvìtší èíslo.

    Pøíklad výstupu:
    Zadejte první èíslo: 5
    Zadejte druhé èíslo: 3
    Zadejte tøetí èíslo: 8
    Nejvìtší èíslo je: 8
     */
    public static void determiningTheGreatestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadejte první èíslo: ");
        int num1 = scanner.nextInt();
        System.out.print("Zadejte druhé èíslo: ");
        int num2 = scanner.nextInt();
        System.out.print("Zadejte tøetí èíslo: ");
        int num3 = scanner.nextInt();
        int result = 0;
        if(num1 > result) result = num1;
        if (num2 > result) result = num2;
        if (num3 > result) result = num3;
        System.out.print("Nejvìtší èíslo je: " + result);

    }
    public static void main(String[] args) {
        characterRecognition();
    }
}
