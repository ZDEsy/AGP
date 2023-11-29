import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Insert {
    public static int type;
    public static void InsertSort(String[] names)
    {
        for(int i = 1; i < names.length; i++)
        {
            for(int j = i-1; j >= 0; j--)
            {
                if(type == 1 && names[i].compareToIgnoreCase(names[j]) < 0)
                {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                    i--;
                } else if (type == 0 && names[i].compareToIgnoreCase(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                    i--;
                }
            }
        }
    }

    private static boolean isInFile(String name) throws IOException {
        return Files.lines(Paths.get("names_dictionary.txt")).anyMatch(l -> l.contains(name));
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jak velké chcete pole?");
        String[] names = new String[Integer.parseInt(sc.nextLine())];
        System.out.println("Doplňte jména do pole:");
        for(int x = 0; x < names.length; x++)
        {
            names[x] = sc.nextLine();
            while(!isInFile(names[x]))
            {
                System.out.println("Jméno není ve slovníku, znovu: ");
                names[x] = sc.nextLine();
            }
        }
        System.out.println("Chcete třídit sestupně(0) nebo vzestupně(1)?");
        type = sc.nextInt();
        while(type != 0 && type != 1)
        {
            System.out.println("Špatně jste zadali hajzli, znovu:");
            type = sc.nextInt();
        }
        InsertSort(names);
        System.out.println(Arrays.toString(names));
    }
}
