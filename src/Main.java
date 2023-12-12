import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Griffindor germiona = new Griffindor("Germiona Graindger", 7, 8,
                7, 9, 9);
        Griffindor ron = new Griffindor("Ron Uizly", 7, 7,
                6, 7, 7);
        Griffindor garry = new Griffindor("Garry Potter", 9, 8,
                9, 9, 8);
        Puffenduy zaharya = new Puffenduy("Zaharya Smit", 7, 8,
                9, 9, 9);
        Puffenduy sedrik = new Puffenduy("Sedrik Diggory", 7, 8,
                7, 9, 9);
        Puffenduy jastin = new Puffenduy("Jastin Fing - Flatchly", 8, 7,
                6, 7, 7);
        Kogtevran chjou = new Kogtevran("Chjou Chang", 8, 8,
                9, 9, 9, 9);
        Kogtevran padma = new Kogtevran("Padma Patil", 7, 8,
                7, 9, 9, 7);
        Kogtevran marcus = new Kogtevran("Marcus Balby", 7, 7,
                6, 7, 7, 6);
        Slizerin dracko = new Slizerin("Dracko Malfoy", 8, 8,
                9, 9, 9, 9, 8);
        Slizerin grehem = new Slizerin("Grehem Montegyu", 8, 8,
                7, 9, 9, 7, 7);
        Slizerin gregory = new Slizerin("Gregory Goyl", 8, 7,
                6, 7, 7, 6, 8);

        System.out.println(jastin);
        System.out.println("________________________________________________________");
        germiona.compareAnyStudents(ron);
        System.out.println("________________________________________________________");
        garry.compareSummGriffindor(germiona);
        zaharya.compareSummPuffenduy(sedrik);
        padma.compareSummKogtevran(marcus);
        dracko.compareSummSlizerin(gregory);
    }
}