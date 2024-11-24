import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextProcessorTest {

    @Test
    public void testBasicLineAndCharacterCount() {
        TextProcessor textProcessor = new TextProcessor();

        textProcessor.processLine("Hello world"); // 11 characters
        textProcessor.processLine("JUnit test"); // 10 characters

        assertEquals(2, textProcessor.getLineCount(), "Number of lines should be 2");
        assertEquals(21, textProcessor.getCharacterCount(), "Number of characters should be 21");
    }

    @Test
    public void testEmptyLines() {
        TextProcessor textProcessor = new TextProcessor();

        textProcessor.processLine(""); // Empty line
        textProcessor.processLine(" "); // Only whitespace
        textProcessor.processLine("Hej"); // Regular text

        assertEquals(3, textProcessor.getLineCount(), "Number of lines should be 3");
        assertEquals(4, textProcessor.getCharacterCount(), "Number of characters should be 4 (1 from 'Hej' and 3 from whitespace)");
    }

    @Test
    public void testNoInput() {
        TextProcessor textProcessor = new TextProcessor();

        // No lines are processed
        assertEquals(0, textProcessor.getLineCount(), "Number of lines should be 0");
        assertEquals(0, textProcessor.getCharacterCount(), "Number of characters should be 0");
    }
}
