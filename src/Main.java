import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Boolean varA = true;
        Boolean varB = false;

        int willekeurig=(int) Math.ceil(Math.random() * 5 );
        // * 5 betekend dat het getal niet groter wordt dan 5

        // als willekeurig GROTER is dan
        if (willekeurig >= 3)
        {
            System.out.println("Getal is 3 of hoger");
        }
        else if (willekeurig == 2)
        {
            System.out.println("willekeurig is exact 2");
        }
        else
        {
            System.out.println("Getal is 2 of lager");
        }

        if (willekeurig == 4 && varA == true)
        {
            System.out.println("beide voorwaarden zijn van toepassing");
        }

        if (varA || varB)
        {
            System.out.println ("een of beide voorwaarden zijn van toepassing");
        }
    }
}