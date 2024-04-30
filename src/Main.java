import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu textul: ");
        String text = scanner.nextLine();

        System.out.print("Introdu lungimea cuvintelor de înlocuit: ");
        int lungimeCuvant = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Introdu un subșir: ");
        String subSir = scanner.nextLine();

        String rezultat = inlocuiesteCuvinte(text, lungimeCuvant, subSir);

        System.out.println("Textul modificat: " + rezultat);
    }

    private static String inlocuiesteCuvinte(String text, int lungimeCuvant, String subSir) {
        String[] cuvinte = text.split("\\s+");
        String rezultat = "";

        for (String cuvant : cuvinte) {
            if (cuvant.length() == lungimeCuvant) {
                rezultat += subSir + " ";
            } else {
                rezultat += cuvant + " ";
            }
        }

        return rezultat;
    }
}