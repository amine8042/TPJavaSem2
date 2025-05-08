import java.util.Scanner;
public class ex3 {
    public static boolean estInf(String verbe) {
        verbe = verbe.toLowerCase();
        return verbe.endsWith("er") || verbe.endsWith("ir") || verbe.endsWith("re") || verbe.endsWith("oir");
    }
    public static String groupe(String verbe) {
        verbe = verbe.toLowerCase();

        if (verbe.equals("aller")) {
            return "3ème groupe (exception)";
        } else if (verbe.endsWith("er")) {
            return "1er groupe";
        } else if (verbe.endsWith("ir")) {
            return "2ème groupe";
        } else {
            return "3ème groupe";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String verbe;

        do {
            System.out.print("Veuillez saisir un verbe à l'infinitif : ");
            verbe = scanner.nextLine();

            if (!estInf(verbe)) {
                System.out.println("Ce verbe n'est pas à l'infinitif. Veuillez réessayer.");
            }
        } while (!estInf(verbe));

        System.out.println("Le verbe \"" + verbe + "\" appartient au " + groupe(verbe) + ".");
    }
}
