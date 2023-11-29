package package_PP;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Person {
    // implementujte 3 atributy: RČ, Jméno, Bydliště (město stačí), Věk
    private String RC;
    private String Jmeno;
    private String Bydliste;
    private long Vek;
    private String dateFormat;


    // implementujte konstruktor s parametry: RČ, Jméno, Bydliště. Věk vypočtěte z rodného čísla.
    public Person(String Jmeno, String RC, String Bydliste){
        this.Jmeno = Jmeno;
        this.Bydliste = Bydliste;
        this.RC = RC;

        DateFormat sdf = new SimpleDateFormat("MMdd");
        sdf.setLenient(false);
        try {
            sdf.parse(RC.substring(2,6));
        } catch (ParseException e) {
            System.out.println(Jmeno + ": Špatný rodný číslo");
        }

        if(Long.parseLong(RC)/100000000L > 23)
        {
            Vek = 123 - Long.parseLong(RC)/100000000L;
        }
        else
        {
            Vek = 23 - Long.parseLong(RC)/100000000L;
        }


    }

    // implementujte get a set pro atributy, uvědomte si které lze měnit


    public String getRC() {
        return RC;
    }

    public long getVek() {
        return Vek;
    }

    public String getBydliste() {
        return Bydliste;
    }

    public String getJmeno() {
        return Jmeno;
    }

    public void setBydliste(String bydliste) {
        Bydliste = bydliste;
    }

    public void setJmeno(String jmeno) {
        Jmeno = jmeno;
    }

    public void setRC(String RC) {
        this.RC = RC;
    }

    // implementujte metodu toSting, ta bude vracet řetězec ve formátu: "Jméno: attr_name; Bydliště: attr_homeTown; Věk: attr_age"
    @Override
    public String toString(){
        return "Jméno: " + Jmeno + "; " + "Bydliště: " + Bydliste + "; " + "Věk: " + Vek;
    }

    // implementujte metodu sayHi, která jako vstupní parametr dostane objekt třídy Person (člověka).
    // Daného člověka následně osloví a popřeje mu hezký den. Například:
    // "Jan: Aá, František. Dlouho jsme se neviděli, doufám, že se máš ve věku 32 dobře.
    // Přeji ti hezký den a užívej si sluníčko."

    public String sayHi(Person person){
        return Jmeno + ": Aá, " + person.Jmeno + ". Dlouho jsme se neviděli, doufám, že se máš ve věku " + person.Vek + " dobře. Přeji ti hezký den a užívej si sluníčko.";
    }
}
