package Tests;

import java.util.Scanner;

public class Test01 {
    /*
    Rozpozn�n� Znaku
    T�ma: V�tven� programu

    Procvi�ovan� u�ivo: V�tven� if, v�tven� switch, z�kladn� vstup a v�stup v Jav�

    Zad�n�:
    Napi�te program v jazyku Java, kter� na�te od u�ivatele jeden znak a slovn� pop�e, o jak� znak se jedn�.
    Pokud je zadan� znak mal� p�smeno (nap�. 'a' a� 'z'), program vyp�e "male pismeno" n�sledovan� t�mto znakem.
    Pokud je zadan� znak velk� p�smeno (nap�. 'A' a� 'Z'), program vyp�e "velke pismeno" n�sledovan� t�mto znakem.
    Pokud je zadan� znak ��slice (nap�. '0' a� '9'), program vyp�e "cislice" n�sledovan� touto ��slic�.
    Pro speci�ln� znaky "!", "?", "*", "@", "#", "^" program vyp�e odpov�daj�c� text: "vykricnik", "otaznik",
    "hvezdicka", "zavinac", "krizek", "striska".
    Pro v�echny ostatn� znaky program vyp�e "jiny znak".
    P��klad v�stupu:
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
    Ur�en� Nejv�t��ho ��sla z Trojice
    T�ma: V�tven� programu

    Procvi�ovan� u�ivo: V�tven� if, z�kladn� vstup a v�stup v Jav�

    Zad�n�:
    Napi�te program v jazyku Java, kter� od u�ivatele na�te t�i cel� ��sla a ur��, kter� z nich je nejv�t��.
    V�sledek pak vyp�e na obrazovku. Program by m�l nejprve vyzvat u�ivatele, aby postupn� zad�val t�i ��sla.
    Pot� by m�l pou��t v�tven� if k porovn�n� t�chto ��sel a ur�en� nejv�t��ho z nich.
    Nakonec by m�l vypsat nejv�t�� ��slo.

    P��klad v�stupu:
    Zadejte prvn� ��slo: 5
    Zadejte druh� ��slo: 3
    Zadejte t�et� ��slo: 8
    Nejv�t�� ��slo je: 8
     */
    public static void determiningTheGreatestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadejte prvn� ��slo: ");
        int num1 = scanner.nextInt();
        System.out.print("Zadejte druh� ��slo: ");
        int num2 = scanner.nextInt();
        System.out.print("Zadejte t�et� ��slo: ");
        int num3 = scanner.nextInt();
        int result = 0;
        if(num1 > result) result = num1;
        if (num2 > result) result = num2;
        if (num3 > result) result = num3;
        System.out.print("Nejv�t�� ��slo je: " + result);

    }
    public static void main(String[] args) {
        characterRecognition();
    }
}
