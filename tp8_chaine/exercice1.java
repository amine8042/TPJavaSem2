import java.util.Scanner;
public class exercice1 {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.println("entrez une chaine");
        String chaine =Scanner.nextLine();
        if (chaine.length()>0){
            int n= chaine.length();
            char Caractere = chaine.charAt(n-1);
            l=l+Caractere}
        else{
            System.out.println("la chaine est vide");
        }
        System.out.println(chaine.toUpperCase());
Scanner.close();
        }
    
}

