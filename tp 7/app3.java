import java.util.Scanner;
public class app3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nl, nc;
        do {
            System.out.print("Entrez le nombre de lignes (nl ≤ 20): ");
            nl = scanner.nextInt();
        } while (nl <= 0 || nl > 20);

        do {
            System.out.print("Entrez le nombre de colonnes (nc ≤ 30): ");
            nc = scanner.nextInt();
        } while (nc <= 0 || nc > 30);
        int[][] M = new int[nl][nc];
        int[] T = new int[nl];
        System.out.println("Entrez les valeurs de la matrice M : ");
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.print("M[" + i + "][" + j + "] : ");
                M[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < nl; i++) {
            int sommeLigne = 0;
            for (int j = 0; j < nc; j++) {
                sommeLigne += M[i][j];
            }
            T[i] = sommeLigne;
        }
        int sommeMin = T[0];
        int sommeMax = T[0];
        
        for (int i = 1; i < nl; i++) {
            if (T[i] < sommeMin) {
                sommeMin = T[i];
            }
            if (T[i] > sommeMax) {
                sommeMax = T[i];
            }
        }
        System.out.println("Somme minimale des lignes : " + sommeMin);
        System.out.println("Somme maximale des lignes : " + sommeMax);

        scanner.close();
    }
}
