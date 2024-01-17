package Exercises;

public class Exercises_01_DataTypes {
    /*
    Průvodce: Berte prozatím vše, co tu vidíte jako černou skříňku. Neřešte klíčová slova class, public, void atd.
    Každé cvičení v rámci cvičebnice, do chvíle než se naučíme pracovat lépe s metodami a principem OOP. Prozatím
    berte metody jako kontejner pro váš kód, který se provede. Budou strukturovány přesně takto. Kód pro vaše
    cvičení vepisujte do dané pojmenované metody viz cvičení Hello world! Následně můžete danou metodu zavolat jejím
    jménem v metodě main viz main. Následně se vám objeví konsole s výstupem. Vše co vytvoříte musí projít testy
    vytvořenými v souboru "src/test/java/Exercises/Exercises_01_DataTypesTest"
     */

    // Následující cvičení je názorné
    /*
    Exercise 0: Hello world!
    vaším úkolem podobně jako v kterémkoliv jazyce v kterém se začíná je naprogramování aplikace, která vytiskne
    text "Hello world!"
    Goal: Seznámit se s funkčností Javy, metodou "pojmenovanou" do které vepisujeme kód, metodou main
     */
    public static void helloWorld() {
        System.out.println("Hello world!");
        /*
        Hint: využívejte zkratky a doporučení, které vám dáva IntelliJ...
        Porovnejte sout+Enter a System.out.println();
         */
    }

    /*
    Naučte se pracovat s komentáři a snažte se osvětlit lidem, co děláte a proč to děláte. Když po vás někdo bude
    číst a procházet vaše výtvory, může se mu udělat nevolno, jestliže nebudete komentovat.
    Právě se díváte na blokový komentář, který je uveden lomítkem + hvězdička. Po odentrování se vám odřádkuje a vytvoří
    se koncová značka sama.
     */

    // - dvě lomítka značí jednořádkový komentář. Používejte spíše bloky, jsou lépe čitelné než 10 jednořádkových komentářů.

    /*
    Vščechny komentáře a metody, můžete skrýt pomocí šipečky v liště, kde jsou očíslované řádky. Následně zde
    můžete i daný blok komentáře rozkliknout.
     */

    /*
    Exercise 1: Name of teacher
    V následující metodě si zkuste práci s výpisem sami. Využijte sout (určitě již tušíte, co dělá) a vytiskněte jméno
    učitele (Petr Helešic) do console (i s háčky nebo čárkami).
    Goal: Zkusit si výpis sám
     */
    public static void nameOfTeacher() {
        System.out.println("Petr Helešic");
    }

    /*
    Exercise 2: Assignment command
    Příkaz přiřazení je jeden z nejdůležitějších příkazů. Jednoduše řečeno tak přiřadíte hodnotu do proměnné. Jsou jazyky,
    kde nemusíte udávat datový typ. Bohužel pro vás, Java tuto utilitu nemá a je nutné všechny datové typy jednoznačně
    deklarovat. Příkaz přiřazení vypadá takto:
    int number = 666;
    Tento příkaz v paměti vyčlení místo pro celé číslo (datový typ "int" -> 4 bajty), toto místo označí danou proměnnou a do paměti
    na toto místo vloží hodnotu 666. Zjednodušeně. Proto lze udělat i následující:
    int myNumber; // pouze deklarace, že bude v proměnné number celé číslo o velikosti do 4 bajtů
    myNumber = 1; // přiřazení do paměti označené myNumber hodnoty čísla 1
    Vytvořte následující proměnné s danými hodnotami:
    proměnná alfa, kde bude číslo 25
    proměnná beta, kde bude řetězec "Hello world!" (datový typ "String")
    Následně je vypište do konsole pomocí názvů proměnných. Nejdříve alfa, poté beta.
    Pod čarou: Nelze kontrolovat názvy proměnných. Proto jsou kontrolovány pouze výstupy.
     */
    public static void exercise002() {
        int alfa = 25;
        String beta = "Hello world!";
        System.out.println(alfa);
        System.out.println(beta);
    }

    /*
    Nyní již pojďme k datovým typům, které naleznete v Javě. Začneme celými čísly. Následující příklady vás provedou
    datovými typy pro celá čísla.
     */

    /*
    Exercise 3: Byte
    Datový typ "byte" je celočíselným typem s rozsahem hodnot -128 až 127 (uložen v 8 bitech, 1 Bajtu).
    Zkuste si inicializovat proměnou byte s pojmenováním "num" na hodnotu 10. Danou proměnnou vypište do konsole
    pomocí sout. Na další řádek vytiskněte součet "num" + 30.
    Zkuste si: vytvořte proměnnou "nelze" - byte nelze = 200;
    Zkuste si: vytvořte proměnnou "zeby" a v dalším příkazu přičtěte proměnou "num" - byte zeby = 127; zeby = zeby + num;
    Vytiskněte předchozí sčítání, místo znovuuložení do proměnné "zeby" - System.out.println(zeby + 1);
    Zamysli se: Proč najednou tato varianta funguje? (Odpověď: Implicitní přetypování)
     */
    public static void exercise003() {
        byte num = 10;
        System.out.println(num);
        System.out.println(num + 30);
        byte zeby = 127;
        System.out.println(zeby + 1);
    }

    /*
    Exercise 4: Short (metoda není testována)
    Datový typ "short" je celočíselným typem s rozsahem hodnot -32 768 až 32 767 (16 bitů, 2 Bajty).
    Zde nechám vaše zkoušení čistě na vás, pokud si s daným datovým typem chcete něco zkusit. Upozorním pouze, že datové
    typy byte a short se používají hlavně v rámci velkých kolekcí dat, kde je nutná určitá úspora paměti. Z dnešního
    pohledu se používá hlavně celočíselný typ int ((ENG) integer - (CZE) celé číslo), o kterém bude řeč následovně.
    Zkuste si: Vytvořte proměnnou num. Vložte hodnotu 32 001. Zkuste přetypovat tuto hodnotu na datový typ byte ->
    byte b = num; nebo byte b = (byte) num;
    Zamysli se: Proč funguje "byte b = (byte) num;"? (Odpověd: Explicitní přetypování) Proč je hodnota 1? (Odpověď:
    Programátorská kalkulačka a posledních 8 bitů)
    Zamysli se: Jak funguje přetypování? Širší datový typ -> užší datový typ NEBO užší datový typ -> širší datový typ
    Info: Přetypování se anglicky řekne Casting
     */
    public static void exercise004() {
        short num;
        num = 32001;
        byte b = (byte) num;
        System.out.println(num);
        System.out.println(b);
    }

    /*
    Exercise 5: Integer (int)
    Datový typ "int" je celočíselným typem s rozsahem hodnot -2^31 až 2^31 - 1 (32 bitů, 4 Bajty).
    Datový typ integer je nejčastějším celočíselným datovým typem, který budete užívat. Pojďme řešit operace s celými
    čísly. Vytvořete proměnné "a" a "b" a dejte jim čísla -327 a 542. Vytiskněte postupně všechny následující klasické
    operace: sčítání, odčítání (a - b), součin, dělení (a / b)
    Zamysli se: Jak funguje dělení v javě nad celočíselným typem?
    Zkuste si: Dělení 0.
    Zamysli se a zkus si: Provede se kód za dělením 0 po objevení chyby? (Odpověď: Ne. Pokud Exception nebudu odchytávat.
     */
    public static void exercise005() {
        int a = -327;
        int b = 542;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }

    /*
    Exercise 6: Integer II
    V případě integeru existují i další operace:
    a % b - modulo: zbytek po dělení a/b (doporučuji se naučit práci s touto operací)
    Vytiskněte zbytek po dělení 35896217/325815
    a >> b - bitový posun: jedná se o posunutí všech bitů čísla a směrem doprava o počet míst b
    a << b - bitový posun: jedná se o posunutí všech bitů čísla a směrem doleva o počet míst b
    Vytiskněte bitový zápis čísla 358. Použíjte k tisku Integer.toBinaryString(358). Využijte bitový posun čísla 358
    doprava o 5 míst a vytiskněte. To stejné, ale tentokrát doleva o 5 míst, bitový posun čísla 358.
     */
    public static void exercise006() {
        System.out.println(35896217 % 325815);
        System.out.println(Integer.toBinaryString(358));
        System.out.println(Integer.toBinaryString(358 >> 5));
        System.out.println(Integer.toBinaryString(358 << 5));
    }

    /*
    Exercise 7: Integer III
    Do teď jsme řešili pouze operace binární (tedy je potřeba mít levý a pravý operand). Nyní se podívejme na operace
    unární. To je situace, kdy je operand pouze jeden. Že si neumíte představit, jakým způsobem to funguje. Typicky se
    jedná o nějaký typ syntaktického cukru (rozumněj zjednodušení zápisu.
    a++; zjednodušení příkazu a = a + 1;
    b--; zjednodušení příkazu b = b - 1;
    přičítání 1 se říká inkrementace, odčítání 1 se říká dekrementace
    Pozor na varianty ++/-- před proměnnou. Pokud použijete varianty ++a nebo --b, vyhodnotí se nejdříve hodnota
    proměnné, která se předá jako argument. Říkáte tím tedy nejdříve přičti 1, a poté vrať hodnotu proměnné. V případě
    ++/-- za proměnnou říkáte nejdříve mi dej proměnnou, teprve poté přičti jedničku a typicky se používá právě tato
    varianta. Důvod je prostý -> čitelnost kódu.
    Do proměnné number vložte hodnotu 0. Přičtěte k num číslo 386530 a přiřadte do num. Vytiskněte číslo num.
    Inkrementujete proměnou num při tisku následovně. System.out.println(num++);
    Zamysli se: Jaká proměnná je v proměnné num ve chvíli, kdy se tento příkaz vykoná?
    Vytiskněte pouze proměnnou, abyste to zjistili. :)
    Dekrementujte proměnou num obdobně jako předtím s tím rozdílem, že vložte operátor -- před proměnnou.
    Myslím, že je zřejmé, co dělají tyto unární operátory
     */
    public static void exercise007() {
        int num = 0;
        num = num + 386530;
        System.out.println(num++);
        System.out.println(num);
        System.out.println(--num);
    }

    /*
    Exercise 8: Integer - Boolean
    To samozřejmě není vše, to asi tušíte. Máme i další operátory. Jedná se o operátory porovnání <, >, ==, <=, >=, !=.
    Popořadě:
    a < b; dostáváme pravdivostní hodnotu zda je hodnota v proměnné a menší než v b
    a <= b; dostáváme pravdivostní hodnotu zda je hodnota v proměnné a menší nebo rovna než v b
    a > b; dostáváme pravdivostní hodnotu zda je hodnota v proměnné a větší než v b
    a >= b; dostáváme pravdivostní hodnotu zda je hodnota v proměnné a větší nebo rovna než v b
    a == b; dostáváme pravdivostní hodnotu zda je hodnota v proměnné a rovna té v b
    a != b; dostáváme pravdivostní hodnotu zda je hodnota v proměnné a nerovna té v b
    Pravdivostní hodnota je pro nás nový datový typ označovaný jako boolean. Boolean může nabývat 2 hodnot true (pravda)
    nebo false (nepravda). K tomu nám stačí 1 bit a je to tudíž nejjednodušší datový typ vůbec. Ale zároveň jeden z těch
    nejmocnějších a hlavních, které řídí programy.
    Napište kód, ve kterém do proměnné int numberInt přiřadíte číslo 0 a do proměnné short numberShort přiřadíte
    číslo 10. Následně se zeptejte, zda je číslo v proměnné numberInt menší než v proměnné numberShort a přiřaď tuto
    hodnotu do proměnné boolean isSmaller. Proměnnou vytiskněte.
    Poznámka pod čarou: !!!Důležité!!! Poprvé požíváme takzvanou camelCase notaci (zápis). Slova pro pojmenování
    nelze dělit. Proto se používá v programování několik způsobů pro zápis několika slovných pojmenování. camelCase je
    syntax, kdy názvy proměnných začínají malým písmenem a každé další slovo začíná písmenem velkým. Od teď až do konce
    našich dnů bychom toto měli dodržovat. V praxi to takto nefunguje, ale byl bych rád, aby vy jste tuto praktiku
    dodržovali.
    Poznámka pod čarou: Stejně jako v předchozím jde spíše o smluvený zápis. Ale kdykoliv máte proměnou s pravdivostní
    hodnotou, která o něčem rozhoduje, pak by měla začínat anglickým slovem "is" (je). V našem případě isSmaller
    "(jeMenší)". Okamžitě v tom případě víte, když čtete daný kód, je uvnitř pravdivostní hodnota.
     */
    public static void exercise008() {
        int numberInt = 0;
        short numberShort = 10;
        boolean isSmaller = numberInt < numberShort;
        System.out.println(isSmaller);
    }

    /*
    Exercise 9: Integer IV
    Poslední cvičení na operátory pro celá čísla. V rámci operátorů, které jsou k dispozici jsme ještě neprošli
    následující:
    a & b - jde o operaci AND nad bity, kontrolujete tedy, zda je v číslech na stejné pozici bit s hodnotou 1, pokud
    ano, vrátíš na dané pozici ve výsledku hodnotu 1.
    a | b - jde o operaci OR nad bity, kontrolujete tedy, zda je v alespoň jednom čísle na stejné pozici bit s
    hodnotou 1, pokud ano, vrátíš na dané pozici ve výsledku hodnotu 1.
    a ^ b - XOR nad bity, znamená buď a nebo. Tedy výsledkem je pro danou pozici 1 v případě, že neplatí AND a platí OR
    Zkuste si sami. Není nezbytně nutné znát
     */
    public static void exercise009() {

    }

    /*
    Exercise 10: Double a Float
    nyní se podíváme na v pořadí třetí základní datový typ a to racionální čísla. Vzhledem k možné ztrátě informace
    při kódování máme pouze dva možné typy double (8 bajtů) a float (4 bajty). Pokud chcete desetinné číslo ve variantě
    float musíte explicitně za daným číslem uvést písmeno f (23.23f), jinak implicitně dostanete číslo double.
    Oddělovač se chová, jak očekáváme z angličtiny. Tedy píšeme tečku namísto čárky.
    Vytvořte proměnnou numberD typu double a proměnnou numberF typu float.
    Do proměnné numberD i numberF vložte číslo 1.12345678 a obě čísla postupně lexikograficky vytiskněte.
    Zamysli se: Proč je jiný výstup?
    Práce s těmito typy je stejná jako s typy celočíselnými. +, -, *, / ad.
    Vytvořte dvě proměnné celočíselné do jedné vložte číslo 23 do druhé 203. Výsledek dělení těchto dvou čísel vložte
    do proměnné typu float a tu následně vytikněte. (Pojmenování proměných závisí na vás) Dejte pozor, aby byl výsledek
    skutečně takový jaký má být.
    Zamyslete se nad výsledky dělení, co vrací operátor / (celočíselné dělení).
     */
    public static void exercise010() {
        double numberD = 1.12345678;
        float numberF = 1.12345678F;
        System.out.println(numberD);
        System.out.println(numberF);
        int num = 23;
        int numB = 203;
        float result = 1.0F * numB / num;
        System.out.println(result);
    }

    /*
    exercise 11: Char
    Poslední primitivním datovým typem je datový typ char. Je to datový typ pro znak, který má 2 bajty v rámci Javy.
    Hodnoty základních znaků naleznete v ASCII tabulce (znak - hodnota). Rozlišujte řádně mezi znakem a
    řetězcem v následujících cvičeních. Znak se vždy uvozuje v jednoduchých apostrofech (char znak = 'u';), řetězec
    v uvozovkách tak jak jsme pracovali v úvodních dvou cvičeních s řetězci (Ahoj světe a hello world). Typ char jinak
    uchovává v počítači klasickou hodnotu číselnou, která označuje daný znak. Proto například můžete dělat s danými
    znaky takové kusy, jako je například sčítání (pozor vrací int a musíte použít explicitní konverzi na char) a
    další operace
    Vytvořte dvě proměnné typu char se znaky 0 a 1. Uvnitř tisku nejdříve znaky sečtěte bez konverze a
    následně s konverzí na char.
     */
    public static void exercise011() {
        char c1 = '0';
        char c2 = '1';
        char res = (char) (c1 + c2);
        System.out.println(c1 + c2);
        System.out.println(res);
    }



    public static void main(String[] args) {
        helloWorld();
        exercise010();
        exercise011();
        nameOfTeacher();
    }
}
