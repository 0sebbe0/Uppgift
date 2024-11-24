public class TextAnalyzer {
    private int totalRows = 0;
    private int totalCharacters = 0;

    // Lägger till ny text för analys
    public void analyzeText(String text) {
        totalRows++;
        totalCharacters += text.length();
    }

    // Returnerar antal rader
    public int getRowCount() {
        return totalRows;
    }

    // Returnerar antal tecken
    public int getCharacterTotal() {
        return totalCharacters;
    }
}

