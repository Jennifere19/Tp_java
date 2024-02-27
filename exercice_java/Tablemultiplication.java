import java.util.Scanner;

public class Tablemultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // instanciation d'un objet Scanner =
        System.out.print("Entrez un nombre pour afficher les tables de multiplication : ");

        int nbre = scanner.nextInt();

        scanner.close(); // A chaque foid que je dois utiliser scanner je dois le close.

        while (nbre < 0 || nbre == 0) {
            System.out.println("Veuillez saisir un nombre superieur a zero.");
            nbre = scanner.nextInt();
        }
        for (int i = 1; i <= nbre; i++) {
            System.out.println("Table " + i + " :");
            for (int j = 1; j <= 12; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
            System.out.println(); // juste pour ajoute une ligne vide apres chaque table de multiplication
        }

    }

}