package package_PP;

import java.util.Random;

public class BankAccount {
    // implementujte 3 atributy: číslo účtu, osoba (objekt třídy Person), zůstatek
    private String accountnum;
    private Person person;
    private int balance;
    private final Random rnd = new Random();

    // implementujte konstruktor s parametry: osoba (objekt třídy Person). číslo účtu vygenerujte jako 6 místné číslo,
    // zůstatek nastavte na 0.
    public BankAccount(Person person){
        this.person = person;
        this.accountnum = String.format("%06d",rnd.nextInt(999999));
        balance = 0;
    }

    // implementujte konstruktor s parametry: osoba (objekt třídy Person) a zůstatek. číslo účtu vygenerujte jako 6
    // místné číslo, zůstatek nastavte na předaný parametr.
    public BankAccount(Person person, int balance){
        this.person = person;
        this.accountnum = String.format("%06d",rnd.nextInt(999999));
        this.balance = balance;
    }

    // implementujte get a set pro atributy, uvědomte si které lze měnit


    public int getBalance() {
        return balance;
    }

    public Person getPerson() {
        return person;
    }

    public String getAccountnum() {
        return accountnum;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountnum(String accountnum) {
        this.accountnum = accountnum;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    // implementujte metodu toSting, ta bude vracet řetězec ve formátu:
    // "Jméno: attr_osoba.name; Bydliště: attr_osoba.homeTown; Číslo účtu: attr_accNumber; Zůstatek: attr_balance"
    @Override
    public String toString() {
        return "Jméno: " + person.getName() + "; Bydliště: " + person.getLiving() + "; Číslo účtu: " + accountnum + "; Zůstatek: " + balance;
    }

    // implementujte metodu pro vklad peněz na účet s parametrem: částka. Maximální vklad je 10 000,- -> Ošetřete.
    // Návratová hodnota je zda akce proběhla korektně (true) nebo ne (false)
    public boolean depositMoney(int amount){
        if(amount <= 0 || amount >= 10000)
        {
            return false;
        }
        else
        {
            balance += amount;
            return true;
        }

    }

    // implementujte metodu pro výběr peněz na účet s parametrem: částka. Maximální výběr je 10 000,- -> Ošetřete.
    // A nesmíte se dostat do záporných částek -> Ošetřete.
    // Návratová hodnota je zda akce proběhla korektně (true) nebo ne (false)
    public boolean withdrawMoney(int amount){
        if(amount <= 0 || amount >= 10000)
        {
            return false;
        }
        else
        {
            balance -= amount;
            return true;
        }
    }
}
