package Exercises;

import java.util.Scanner;

public class Exercises_02_Strings {
    /*
    Exercise 12: Print, Scanner
    Poj�me se nyn� pobavit nejd��ve o vstupu a v�stupu. Jeliko� se jedn� hlavn� o komunikaci mezi u�ivatelem a programem
    je nesm�rn� d�le�it� spr�vn� form�tovat jak v�stup, tak spr�vn� p��jmat vstup.

    O v�stupu jsme ji� mluvili. Jedn� se o metodu z knihovny System.out konkr�tn� println. Existuj�, ale i dal�� metody
    my si je nyn� pop�eme. Kontext, kter� chceme tisknout v�dy vkl�d�me do z�vorek metody.
    System.out.print(argument); - jde o tisk argumentu, nedojde k od��dkov�n�, mus� b�t uveden argument
    System.out.println(argument); - tisk argumentu na ��dek a od��dkov�n�, pokud argument nen� uveden, pouze od��dkuje
    System.out.printf(arg, a, b, c, ...); - argument v tomto p��pad� je form�tovan� �et�zec pomoc� speci�ln�ch zna�ek,
        za kter� se dosazuj� hodnoty prom�nn�ch zadan�ch za argumentem.

    Pro na��t�n� je situace slo�it�j��. Poprv� mus�me vyu��t t�idy. Tou t��dou je t��da Scanner. Jak n�zev napov�d�,
    jedn� se o t��du, kter� scanuje vstup. Abyste mohli instanci t��dy Scanner pou��vat, mus�te u��t n�sleduj�c�
    konstrukci: Scanner scanner = new Scanner(System.in, "windows-1250"); (p�edstavte si to tak, �e jste v tuto chv�li
    scanner pomoc� kl��ov�ho slova new vyrobily a nyn� ho m��ete pou��vat)
    N�sledn� pomoc� metody scanneru nextLine (scanner.nextLine();) m��ete sd�lit programu, �e o�ek�v�te na vstup dal��
    ��dek a ten na�tete.

    A v neposledn� �ad�, pro� je tato t��da v�bec takto pojmenovan�, se budeme zab�vat druhou t��dou a to je t��da String.
    Pro ulo�en� Stringu do prom�nn� sta�� ur�it datov� typ (String) pojmenovat prom�nnou a p�i�adit �et�zec:
    String nameOfString = "";
    Metoda Scanneru nextLine(), pr�v� takov� �et�zec vrac�. Zkuste si tedy p��jmout n�jak� vstup p�i�adit do prom�nn� a
    tu n�sledn� vypsat do console zp�t.
     */
    public static void exercise012() {
        Scanner scanner = new Scanner(System.in, "windows-1250");
        String s = scanner.nextLine();
        System.out.println(s);
    }

    /*
    Exercise 13: String
    Poj�me se nyn� nau�it pracovat s �et�zci. S �et�zci m��eme d�lat spoustu implicitn�ch v�c� a spoustu z�le�itost�,
    kter� se t�kaj� p��mo t��dy. Jedna z jednoduch�ch �innost� je spojen� 2 �et�zc�. K tomu se pou��v� oper�tor '+'.
    String concat = "Hello" + "world"; Zkuste si, jak bude v�stup vypadat. Dan� funkcionalit� se ��k� Konkatence.
    Metody nad t��dou String, kter� byste m�li zn�t hned od po��tku jsou n�sleduj�c� (na prvn�m ��dku je zaveden�
    �et�zce, n�sledn� nad n�m vykon�v�me dan� metody):
    String str = "Hello world!";
    str.length(); Vrac� d�lku �et�zce (po�et znak�) jako int
    str.toUpperCase(); Vrac� �et�zec ve velk�ch p�smenech
    str.toLowerCase(); Vrac� �et�zec v mal�ch p�smenech
    str.indexOf("world"); Vrac� index prvn�ho v�skytu dan�ho slova, p�smene (od 0). Pokud nenalezne, vrac� -1.
    Pokud chcete vyu��t speci�ln� znaky jako jsou uvozovky, apostrof a lom�tko, uvnit� textu. Mus�te dan� znak
    odlom�tkovat
    Zkuste si rozd�l mezi:
    System.out.println(""J� jsem tu doma" �ekl Pepa");
    System.out.println("\"J� jsem tu doma\" �ekl Pepa");
    Existuj� i dal�� speci�ln� znaky, kter� spolu s lom�tkem tvo�� ur�itou funkcionalitu:
    \n - nov� ��dek
    \r - Carriage return, jde o princip n�vratu na za��tek ��dku (p�i println() doch�zi pr�v� ob�ma p�edchoz�m zna�k�m)
    \t - tabul�tor
    \b - backspace
    Zkuste si: v exercise013 sami zkuste pr�ci s �et�zci a jejich z�kladn�mi metodami. Nen� testov�no.
     */
    public static void exercise013() {
        String str = "Hello world!";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf("world"));
        System.out.println("\"J� jsem tu doma\" �ekl Pepa");
    }

    /*
    Exercise014: Printf
    Poj�me na cvi�en�. V �vodn�m cvi�en� t�to kapitoly, jsme zm�nili metodu printf, kter� bere za argumenty �et�zec,
    s form�tovac�mi zna�kami a za t�mto �et�zcem hodnoty, pro nahrazen� form�tovac�ch zna�ek. Zkuste n�sleduj�c�:
    System.out.printf("Cel� ��slo: %d, Desetinn� ��slo: %.2f, Text: %s", 25, 3.34682, "Hello world");
    Samoz�ejm� m��ete m�sto konkr�tn�ch hodnot pou��vat prom�nn�. Poj�me si p�edstavit v�echny form�tovac� zna�ky:
    %d - zna�ka, kter� zna�� pozici pro cel� ��slo.
    %f - zna�ka, kter� zna�� pozici pro desetinn� ��slo. U t�to zna�ky m��ete pou��t nap��klad i roz���en�, pro v�pis
    ur�it�ho po�tu desetinn�ch m�st. K tomu se vyu��v� syntaxe %.xf, kde x nahrad�te ��slem pro po�et ��slic za
    desetinnou ��rkou
    %s - zan�ka, kter� bude nahrazena textem. Zde m��ete vyu��t form�tov�n� v�stupu pomoc� ��sla p�ed s. To zna��, kolik
    znak�, pro v�pis pot�ebujete a JAVA v�m je vyhrad�. pokud je nenapln�te, pak se automatikcy zarovn�vaj� do prava.
    Pokud p�ed ��slo p�id�te znak '-', pak se text uvnit� vymezen�ho prostoru zarovn� do leva.
    %n - zna�ka vlo�� konec ��dku
    Zkuste si bez testov�n�, p��t� ji� ��dn� cvi�en�.
     */
    public static void exercise014() {
        System.out.printf("Cel� ��slo: %d, Desetinn� ��slo: %.2f, Text: %s%n", 25, 3.34682, "Hello world");
        System.out.printf("|%-20s|", "JAVA");
    }

    /*
    Exercise 15: Output format
    Poj�me vytvo�it kone�n� n�jak� hodnoty. Vytvo�te n�sleduj�c� tabulku pomoc� form�tov�n� v�stupu. Uv�domte si, �e
    v�e mus� p�esn� odpov�dat:
    --------------------------------
     Datov� typy v JAVA
    --------------------------------
    | KATEGORIE  | JMENO    | BITY |
    --------------------------------
    | Desetinn�  | double   |   64 |
    | Desetinn�  | float    |   32 |
    | Cel� ��slo | long     |   64 |
    | Cel� ��slo | int      |   32 |
    | Cel� ��slo | short    |   16 |
    | Cel� ��slo | byte     |    8 |
    | Cel� ��slo | char     |   16 |
    | Boolean    | boolean  |    1 |
    --------------------------------
     */
    public static void exercise015() {
        System.out.printf("--------------------------------%n");
        System.out.printf(" Datov� typy v JAVA%n");
        System.out.printf("--------------------------------%n");
        System.out.printf("| %-10S | %-8S | %4S |%n", "Kategorie", "Jmeno", "Bity");
        System.out.printf("--------------------------------%n");
        System.out.printf("| %-10s | %-8s | %4S |%n", "Desetinn�", "double", "64");
        System.out.printf("| %-10s | %-8s | %4S |%n", "Desetinn�", "float", "32");
        System.out.printf("| %-10s | %-8s | %4S |%n", "Cel� ��slo", "long", "64");
        System.out.printf("| %-10s | %-8s | %4S |%n", "Cel� ��slo", "int", "32");
        System.out.printf("| %-10s | %-8s | %4S |%n", "Cel� ��slo", "short", "16");
        System.out.printf("| %-10s | %-8s | %4S |%n", "Cel� ��slo", "byte", "8");
        System.out.printf("| %-10s | %-8s | %4S |%n", "Cel� ��slo", "char", "16");
        System.out.printf("| %-10s | %-8s | %4S |%n", "Boolean", "boolean", "1");
        System.out.printf("--------------------------------%n");
    }

    public static void main(String[] args) {
        exercise015();
    }
}
