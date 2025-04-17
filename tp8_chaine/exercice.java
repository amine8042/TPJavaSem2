import java.util.Scanner;
public class exercice  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaine: ");
        String chaine = scanner.nextLine();
        if (chaine.length() > 0) {
            char premierCaractere = chaine.charAt(0);
            char dernierCaractere = chaine.charAt(chaine.length() - 1);
            System.out.println("Premier caractère : " + premierCaractere);
            System.out.println("Dernier caractère : " + dernierCaractere);
        } else {
            System.out.println("La chaîne est vide.");
        }
        scanner.close();
    }
}
