package package_PP;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Person {
    // implementujte 3 atributy: RČ, Jméno, Bydliště (město stačí), Věk
    private String nin;
    private String name;
    private String living;
    private final long age;


    // implementujte konstruktor s parametry: RČ, Jméno, Bydliště. Věk vypočtěte z rodného čísla.
    public Person(String name, String nin, String living){
        this.name = name;
        this.living = living;
        this.nin = nin;

        DateFormat sdf = new SimpleDateFormat("yyMMdd");
        sdf.setLenient(false);
        try {
            sdf.parse(nin.substring(0,6));
        } catch (ParseException e) {
            System.out.println(name + ": Špatný rodný číslo");
        }

        String date = String.valueOf(LocalDate.now());
        boolean a = Long.parseLong(nin)/100000000 > Integer.parseInt(date.substring(2,4));
        boolean b = Integer.parseInt(nin.substring(2,4)) > Integer.parseInt(date.substring(5,7));
        boolean c = Integer.parseInt(nin.substring(2,4)) == Integer.parseInt(date.substring(5,7));
        boolean d = Integer.parseInt(nin.substring(4,6)) > Integer.parseInt(date.substring(8,10));


        if(a  && b || a  && c && d)
        {
            age = 122 - Long.parseLong(nin)/100000000;
        }
        else if(b || c && d)
        {
            age = 22 - Long.parseLong(nin)/100000000;
        }
        else if(a)
        {
            age = 123 - Long.parseLong(nin)/100000000;
        }
        else
        {
            age = 23 - Long.parseLong(nin)/100000000;
        }
    }

    // implementujte get a set pro atributy, uvědomte si které lze měnit


    public String getNin() {
        return nin;
    }

    public long getAge() {
        return age;
    }

    public String getLiving() {
        return living;
    }

    public String getName() {
        return name;
    }

    public void setLiving(String living) {
        this.living = living;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNin(String nin) {
        this.nin = nin;
    }

    // implementujte metodu toSting, ta bude vracet řetězec ve formátu: "Jméno: attr_name; Bydliště: attr_homeTown; Věk: attr_age"
    @Override
    public String toString(){
        return "Jméno: " + name + "; " + "Bydliště: " + living + "; " + "Věk: " + age;
    }

    // implementujte metodu sayHi, která jako vstupní parametr dostane objekt třídy Person (člověka).
    // Daného člověka následně osloví a popřeje mu hezký den. Například:
    // "Jan: Aá, František. Dlouho jsme se neviděli, doufám, že se máš ve věku 32 dobře.
    // Přeji ti hezký den a užívej si sluníčko."

    public String sayHi(Person person){
        return name + ": Aá, " + person.name + ". Dlouho jsme se neviděli, doufám, že se máš ve věku " + person.age + " dobře. Přeji ti hezký den a užívej si sluníčko.";
    }
}
