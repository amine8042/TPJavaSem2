import java.util.Scanner;
public class app2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nl, nc;
        
        do {
            System.out.print("Entrez le nombre de lignes (1-29) : ");
            nl = scanner.nextInt();
        } while (nl <= 0 || nl >= 30);
        
        do {
            System.out.print("Entrez le nombre de colonnes (1-29) : ");
            nc = scanner.nextInt();
        } while (nc <= 0 || nc >= 30);
        
        import java.util.Scanner;
        public class app2 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
        
                int[][] M = new int[nl][nc];
                int somme = 0;
                long produit = 1;
                int totalElements = nl * nc;
                
                System.out.println("Remplissez la matrice :");
                for (int i = 0; i < nl; i++) {
                    for (int j = 0; j < nc; j++) {
                        System.out.print("Entrez un nombre pour la case [" + i + "][" + j + "] : ");
                        M[i][j] = scanner.nextInt();
                        somme += M[i][j];
                        produit *= M[i][j];
                    }
                }
        
        double moyenne = (double) somme / totalElements;
        
    
        System.out.println("Somme des éléments : " + somme);
        System.out.println("Produit des éléments : " + produit);
        System.out.println("Moyenne des éléments : " + moyenne);
        
        scanner.close();
    }
}
