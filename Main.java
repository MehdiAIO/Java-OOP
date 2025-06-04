import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String filePath = "text.txt";
        String text = "";  // initialized to avoid compilation error

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Écrire quelque chose:");
            text = scanner.nextLine();
        } catch (Exception e) {
            System.err.println("Erreur lors de la lecture de l'entrée: " + e.getMessage());
        }

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(text);
            System.out.println("Texte enregistré dans le fichier.");
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier: " + e.getMessage());
        }
    }
}
