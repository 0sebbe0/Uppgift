import java.util.Scanner;

public class ReaderApp {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        TextAnalyzer analyzer = new TextAnalyzer();

        System.out.println("Välkommen! Skriv in din text (skriv 'STOP' för att avsluta):");

        boolean running = true;
        while (running) {
            String userInput = inputReader.nextLine();

            if (userInput.trim().equalsIgnoreCase("STOP")) {
                running = false;
            } else {
                analyzer.analyzeText(userInput);
            }
        }

        System.out.println("\nSammanfattning:");
        System.out.println("Totalt antal rader: " + analyzer.getRowCount());
        System.out.println("Totalt antal tecken (inkl. mellanslag): " + analyzer.getCharacterTotal());
        System.out.println("Tack för att du använde programmet!");
    }
}
