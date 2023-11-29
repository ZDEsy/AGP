package package_PP;

import java.util.Random;

public class BankAccount {
    // implementujte 3 atributy: číslo účtu, osoba (objekt třídy Person), zůstatek
    private String cislouctu;
    private Person osoba;
    private int zustatek;
    private final Random rnd = new Random();

    // implementujte konstruktor s parametry: osoba (objekt třídy Person). číslo účtu vygenerujte jako 6 místné číslo,
    // zůstatek nastavte na 0.
    public BankAccount(Person osoba){
        this.osoba = osoba;
        this.cislouctu = String.format("%06d",rnd.nextInt(999999));
        zustatek = 0;
    }

    // implementujte konstruktor s parametry: osoba (objekt třídy Person) a zůstatek. číslo účtu vygenerujte jako 6
    // místné číslo, zůstatek nastavte na předaný parametr.
    public BankAccount(Person osoba, int zustatek){
        this.osoba = osoba;
        this.cislouctu = String.format("%06d",rnd.nextInt(999999));
        this.zustatek = zustatek;
    }

    // implementujte get a set pro atributy, uvědomte si které lze měnit


    public int getZustatek() {
        return zustatek;
    }

    public Person getOsoba() {
        return osoba;
    }

    public String getCislouctu() {
        return cislouctu;
    }

    public void setZustatek(int zustatek) {
        this.zustatek = zustatek;
    }

    public void setCislouctu(String cislouctu) {
        this.cislouctu = cislouctu;
    }

    public void setOsoba(Person osoba) {
        this.osoba = osoba;
    }

    // implementujte metodu toSting, ta bude vracet řetězec ve formátu:
    // "Jméno: attr_osoba.name; Bydliště: attr_osoba.homeTown; Číslo účtu: attr_accNumber; Zůstatek: attr_balance"
    @Override
    public String toString() {
        return "Jméno: " + osoba.getJmeno() + "; Bydliště: " + osoba.getBydliste() + "; Číslo účtu: " + cislouctu + "; Zůstatek: " + zustatek;
    }

    // implementujte metodu pro vklad peněz na účet s parametrem: částka. Maximální vklad je 10 000,- -> Ošetřete.
    // Návratová hodnota je zda akce proběhla korektně (true) nebo ne (false)
    public boolean depositMoney(int castka){
        if(castka <= 0 || castka >= 10000)
        {
            System.out.print("Špatná částka zmrde = ");
            return false;
        }
        else
        {
            zustatek += castka;
            return true;
        }

    }

    // implementujte metodu pro výběr peněz na účet s parametrem: částka. Maximální výběr je 10 000,- -> Ošetřete.
    // A nesmíte se dostat do záporných částek -> Ošetřete.
    // Návratová hodnota je zda akce proběhla korektně (true) nebo ne (false)
    public boolean withdrawMoney(int castka){
        if(castka <= 0 || castka >= 10000)
        {
            System.out.print("Špatná částka zmrde = ");
            return false;
        }
        else
        {
            zustatek -= castka;
            return true;
        }
    }
}
