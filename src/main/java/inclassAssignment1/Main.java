package inclassAssignment1;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise;
        String language = "en";
        String country = "US";
        int numberOfItems;
        int totalPrice = 0;

        System.out.println("Select a language:");
        System.out.println("1. English");
        System.out.println("2. Finnish");
        System.out.println("3. Swedish");
        System.out.println("4. Japanese");
        choise = scanner.nextInt();

        if (choise == 1) {
            language = "en";
            country = "US";
        } else if (choise == 2) {
            language = "fi";
            country = "FI";
        } else if (choise == 3) {
            language = "sv";
            country = "SE";
        } else if (choise == 4) {
            language = "ja";
            country = "JP";
        }

        Locale locale = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("messageBundle", locale);
        String numberOfItemsMessage = rb.getString("numberOfItemsMessage");
        String priceMessage = rb.getString("priceMessage");
        String quantityMessage = rb.getString("quantityMessage");
        String costMessage = rb.getString("costMessage");

        System.out.print(numberOfItemsMessage + ": ");
        numberOfItems = scanner.nextInt();
        for (int i = 0; i < numberOfItems; i++) {
            System.out.print(priceMessage + ": ");
            int price = scanner.nextInt();
            System.out.print(quantityMessage + ": ");
            int quantity = scanner.nextInt();

            totalPrice += price * quantity;
        }
        System.out.print(costMessage + ": " + totalPrice);



        scanner.close();

    }
}
