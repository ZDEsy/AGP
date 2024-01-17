package Tests;

import java.util.Scanner;

public class Test02 {
    /*
    N�sobilka
    T�ma: Cykly
    Procvi�ovan� u�ivo: Cykly (for, while), aritmetick� oper�tory, oper�tory p�i�azen� a porovn�n�, z�kladn� vstup a
    v�stup v Jav�
    Zad�n�:
    Napi�te program v jazyku Java, kter� od u�ivatele p�ijme jedno cel� ��slo a vyp�e na obrazovku v�echny jeho n�sobky
    men�� nebo rovny 100. Program by m�l nejprve vyzvat u�ivatele k zad�n� cel�ho ��sla. N�sledn� by m�l pou��t cyklus
    (nap�. for nebo while) k vygenerov�n� a vyps�n� v�ech n�sobk� tohoto ��sla, kter� jsou men�� nebo rovny 100.
    P�i generov�n� n�sobk� je t�eba vyu��t aritmetick� oper�tory a oper�tory porovn�n�. Pozor na z�porn� ��sla a 0,
    vra�te v tom p��pad� hl�ku "wrong input".
    P��klad v�stupu:
    Zadejte ��slo: 15
    15
    30
    45
    60
    75
    90
     */
    public static void multiplication(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte ��slo: ");
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
    Prvo��sla
    T�ma: Cykly
    Procvi�ovan� u�ivo: cykly, aritmetick� oper�tory, oper�tor p�i�azen�, oper�tory porovn�n�, z�kladn� vstup a v�stup
    Napi�te v jazyku C program, kter� vyp�e na obrazovku v�echna prvo��sla men�� ne� 100.
    P��klad v�stupu:
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
    �tverec
    T�ma: Cykly
    Procvi�ovan� u�ivo: cykly, aritmetick� oper�tory, oper�tor p�i�azen�, oper�tory porovn�n�, z�kladn� vstup a v�stup
    Napi�te v jazyku C program, kter� vykresl� pomoc� znaku "*" na obrazovku �tverec zadan� velikosti.
    P��klad v�stupu:
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
