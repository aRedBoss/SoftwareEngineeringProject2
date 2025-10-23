package inclassAssignment1;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testEnglishLanguage() {
        ResourceBundle rb = ResourceBundle.getBundle("messageBundle", new Locale("en", "US"));
        assertEquals("Enter the number of items to purchase", rb.getString("numberOfItemsMessage"));
        }
    @Test
    void testFinnishLanguage() {
        ResourceBundle rb = ResourceBundle.getBundle("messageBundle", new Locale("fi", "FI"));
        assertEquals("Syötä ostettavien tuotteiden määrä", rb.getString("numberOfItemsMessage"));
    }
    @Test
    void testSwedishLanguage() {
        ResourceBundle rb = ResourceBundle.getBundle("messageBundle", new Locale("sv", "SE"));
        assertEquals("Ange antalet varor att köpa", rb.getString("numberOfItemsMessage"));
    }
    @Test
    void testJapaneseLanguage() {
        ResourceBundle rb = ResourceBundle.getBundle("messageBundle", new Locale("ja", "JP"));
        assertEquals("購入する商品の数を入力してください", rb.getString("numberOfItemsMessage"));
    }
    @Test
    void calc() {

    }

}