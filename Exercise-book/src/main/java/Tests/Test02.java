package Tests;

import java.util.Scanner;

public class Test02 {
    /*
    Násobilka
    Téma: Cykly
    Procvièované uèivo: Cykly (for, while), aritmetické operátory, operátory pøiøazení a porovnání, základní vstup a
    vıstup v Javì
    Zadání:
    Napište program v jazyku Java, kterı od uivatele pøijme jedno celé èíslo a vypíše na obrazovku všechny jeho násobky
    menší nebo rovny 100. Program by mìl nejprve vyzvat uivatele k zadání celého èísla. Následnì by mìl pouít cyklus
    (napø. for nebo while) k vygenerování a vypsání všech násobkù tohoto èísla, které jsou menší nebo rovny 100.
    Pøi generování násobkù je tøeba vyuít aritmetické operátory a operátory porovnání. Pozor na záporná èísla a 0,
    vrate v tom pøípadì hlášku "wrong input".
    Pøíklad vıstupu:
    Zadejte èíslo: 15
    15
    30
    45
    60
    75
    90
     */
    public static void multiplication(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte èíslo: ");
        int num = sc.nextInt();
        int baseNum = num;
        if(num <= 0 || num > 100)
        {
            System.out.println("wrong input");
        }
        else
        {
            while(num <= 100)
            {
                System.out.println(num);
                num += baseNum;
            }
        }
    }

    /*
    Prvoèísla
    Téma: Cykly
    Procvièované uèivo: cykly, aritmetické operátory, operátor pøiøazení, operátory porovnání, základní vstup a vıstup
    Napište v jazyku C program, kterı vypíše na obrazovku všechna prvoèísla menší ne 100.
    Pøíklad vıstupu:
    Prvocisla:
    2,  3,  5,  7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
     */
    public static void primeNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prvocisla:");
        int count = 0;
        for(int i = 2; i < 100; i++)
        {
            for(int j = i; j >= 1; j--)
            {
                if(i%j == 0)
                {
                    count++;
                }
            }
            if(count <= 2) System.out.print(i + ", ");
            count = 0;
        }
    }

    /*
    Ètverec
    Téma: Cykly
    Procvièované uèivo: cykly, aritmetické operátory, operátor pøiøazení, operátory porovnání, základní vstup a vıstup
    Napište v jazyku C program, kterı vykreslí pomocí znaku "*" na obrazovku ètverec zadané velikosti.
    Pøíklad vıstupu:
    Zadejte velikost ctverce: 5
    *****
    *   *
    *   *
    *   *
    *****
     */
    public static void square() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadejte velikost ctverce: ");
        int size = scanner.nextInt();
        for(int line = 0; line < size; line++)
        {
            for(int column = 0; column < size; column++)
            {
                if(line == 0) System.out.print("*");
                else if(line == size-1) System.out.print("*");
                else if(column == 0 || column == size-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        square();
    }
}
