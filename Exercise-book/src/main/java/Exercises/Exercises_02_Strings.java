package Exercises;

import java.util.Scanner;

public class Exercises_02_Strings {
    /*
    Exercise 12: Print, Scanner
    Pojïme se nyní pobavit nejdøíve o vstupu a výstupu. Jelikož se jedná hlavnì o komunikaci mezi uživatelem a programem
    je nesmírnì dùležité správnì formátovat jak výstup, tak správnì pøíjmat vstup.

    O výstupu jsme již mluvili. Jedná se o metodu z knihovny System.out konkrétnì println. Existují, ale i další metody
    my si je nyní popíšeme. Kontext, který chceme tisknout vždy vkládáme do závorek metody.
    System.out.print(argument); - jde o tisk argumentu, nedojde k odøádkování, musí být uveden argument
    System.out.println(argument); - tisk argumentu na øádek a odøádkování, pokud argument není uveden, pouze odøádkuje
    System.out.printf(arg, a, b, c, ...); - argument v tomto pøípadì je formátovaný øetìzec pomocí speciálních znaèek,
        za které se dosazují hodnoty promìnných zadaných za argumentem.

    Pro naèítání je situace složitìjší. Poprvé musíme využít tøidy. Tou tøídou je tøída Scanner. Jak název napovídá,
    jedná se o tøídu, která scanuje vstup. Abyste mohli instanci tøídy Scanner používat, musíte užít následující
    konstrukci: Scanner scanner = new Scanner(System.in, "windows-1250"); (pøedstavte si to tak, že jste v tuto chvíli
    scanner pomocí klíèového slova new vyrobily a nyní ho mùžete používat)
    Následnì pomocí metody scanneru nextLine (scanner.nextLine();) mùžete sdìlit programu, že oèekáváte na vstup další
    øádek a ten naètete.

    A v neposlední øadì, proè je tato tøída vùbec takto pojmenovaná, se budeme zabývat druhou tøídou a to je tøída String.
    Pro uložení Stringu do promìnné staèí urèit datový typ (String) pojmenovat promìnnou a pøiøadit øetìzec:
    String nameOfString = "";
    Metoda Scanneru nextLine(), právì takový øetìzec vrací. Zkuste si tedy pøíjmout nìjaký vstup pøiøadit do promìnné a
    tu následnì vypsat do console zpìt.
     */
    public static void exercise012() {
        Scanner scanner = new Scanner(System.in, "windows-1250");
        String s = scanner.nextLine();
        System.out.println(s);
    }

    /*
    Exercise 13: String
    Pojïme se nyní nauèit pracovat s øetìzci. S øetìzci mùžeme dìlat spoustu implicitních vìcí a spoustu záležitostí,
    které se týkají pøímo tøídy. Jedna z jednoduchých èinností je spojení 2 øetìzcù. K tomu se používá operátor '+'.
    String concat = "Hello" + "world"; Zkuste si, jak bude výstup vypadat. Dané funkcionalitì se øíká Konkatence.
    Metody nad tøídou String, které byste mìli znát hned od poèátku jsou následující (na prvním øádku je zavedení
    øetìzce, následnì nad ním vykonáváme dané metody):
    String str = "Hello world!";
    str.length(); Vrací délku øetìzce (poèet znakù) jako int
    str.toUpperCase(); Vrací øetìzec ve velkých písmenech
    str.toLowerCase(); Vrací øetìzec v malých písmenech
    str.indexOf("world"); Vrací index prvního výskytu daného slova, písmene (od 0). Pokud nenalezne, vrací -1.
    Pokud chcete využít speciální znaky jako jsou uvozovky, apostrof a lomítko, uvnitø textu. Musíte daný znak
    odlomítkovat
    Zkuste si rozdíl mezi:
    System.out.println(""Já jsem tu doma" øekl Pepa");
    System.out.println("\"Já jsem tu doma\" øekl Pepa");
    Existují i další speciální znaky, které spolu s lomítkem tvoøí urèitou funkcionalitu:
    \n - nový øádek
    \r - Carriage return, jde o princip návratu na zaèátek øádku (pøi println() docházi právì obìma pøedchozím znaèkám)
    \t - tabulátor
    \b - backspace
    Zkuste si: v exercise013 sami zkuste práci s øetìzci a jejich základními metodami. Není testováno.
     */
    public static void exercise013() {
        String str = "Hello world!";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf("world"));
        System.out.println("\"Já jsem tu doma\" øekl Pepa");
    }

    /*
    Exercise014: Printf
    Pojïme na cvièení. V Úvodním cvièení této kapitoly, jsme zmínili metodu printf, která bere za argumenty øetìzec,
    s formátovacími znaèkami a za tímto øetìzcem hodnoty, pro nahrazení formátovacích znaèek. Zkuste následující:
    System.out.printf("Celé èíslo: %d, Desetinné èíslo: %.2f, Text: %s", 25, 3.34682, "Hello world");
    Samozøejmì mùžete místo konkrétních hodnot používat promìnné. Pojïme si pøedstavit všechny formátovací znaèky:
    %d - znaèka, která znaèí pozici pro celé èíslo.
    %f - znaèka, která znaèí pozici pro desetinné èíslo. U této znaèky mùžete použít napøíklad i rozšíøení, pro výpis
    urèitého poètu desetinných míst. K tomu se využívá syntaxe %.xf, kde x nahradíte èíslem pro poèet èíslic za
    desetinnou èárkou
    %s - zanèka, která bude nahrazena textem. Zde mùžete využít formátování výstupu pomocí èísla pøed s. To znaèí, kolik
    znakù, pro výpis potøebujete a JAVA vám je vyhradí. pokud je nenaplníte, pak se automatikcy zarovnávají do prava.
    Pokud pøed èíslo pøidáte znak '-', pak se text uvnitø vymezeného prostoru zarovná do leva.
    %n - znaèka vloží konec øádku
    Zkuste si bez testování, pøíštì již øádné cvièení.
     */
    public static void exercise014() {
        System.out.printf("Celé èíslo: %d, Desetinné èíslo: %.2f, Text: %s%n", 25, 3.34682, "Hello world");
        System.out.printf("|%-20s|", "JAVA");
    }

    /*
    Exercise 15: Output format
    Pojïme vytvoøit koneènì nìjaké hodnoty. Vytvoøte následující tabulku pomocí formátování výstupu. Uvìdomte si, že
    vše musí pøesnì odpovídat:
    --------------------------------
     Datové typy v JAVA
    --------------------------------
    | KATEGORIE  | JMENO    | BITY |
    --------------------------------
    | Desetinné  | double   |   64 |
    | Desetinné  | float    |   32 |
    | Celé èíslo | long     |   64 |
    | Celé èíslo | int      |   32 |
    | Celé èíslo | short    |   16 |
    | Celé èíslo | byte     |    8 |
    | Celé èíslo | char     |   16 |
    | Boolean    | boolean  |    1 |
    --------------------------------
     */
    public static void exercise015() {
        System.out.printf("--------------------------------%n");
        System.out.printf(" Datové typy v JAVA%n");
        System.out.printf("--------------------------------%n");
        System.out.printf("| %-10S | %-8S | %4S |%n", "Kategorie", "Jmeno", "Bity");
        System.out.printf("--------------------------------%n");
        System.out.printf("| %-10s | %-8s | %4S |%n", "Desetinné", "double", "64");
        System.out.printf("| %-10s | %-8s | %4S |%n", "Desetinné", "float", "32");
        System.out.printf("| %-10s | %-8s | %4S |%n", "Celé èíslo", "long", "64");
        System.out.printf("| %-10s | %-8s | %4S |%n", "Celé èíslo", "int", "32");
        System.out.printf("| %-10s | %-8s | %4S |%n", "Celé èíslo", "short", "16");
        System.out.printf("| %-10s | %-8s | %4S |%n", "Celé èíslo", "byte", "8");
        System.out.printf("| %-10s | %-8s | %4S |%n", "Celé èíslo", "char", "16");
        System.out.printf("| %-10s | %-8s | %4S |%n", "Boolean", "boolean", "1");
        System.out.printf("--------------------------------%n");
    }

    public static void main(String[] args) {
        exercise015();
    }
}
