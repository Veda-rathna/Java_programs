package AJP_Practicals;

//Formatting dates and currencies.

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;
import java.math.BigDecimal;

public class Unit2Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read date input
        System.out.println("Enter date (YYYY-MM-DD): ");
        String dateInput = scanner.nextLine().trim();
        LocalDate date;

        // Parse date input
        try {
            date = LocalDate.parse(dateInput);
        } catch (Exception e) {
            System.err.println("Error parsing date input. Please enter a valid date in YYYY-MM-DD format.");
            scanner.close();
            return;
        }

        // Read currency input
        System.out.println("Enter currency amount: ");
        String currencyInput = scanner.nextLine().trim();
        BigDecimal currencyAmount;

        // Parse currency amount input
        try {
            currencyAmount = new BigDecimal(currencyInput);
        } catch (Exception e) {
            System.err.println("Error parsing currency amount input. Please enter a valid numeric amount.");
            scanner.close();
            return;
        }

        // Define locales
        Locale[] locales = { Locale.US, Locale.UK, Locale.GERMANY };

        // Format and display the date in each locale
        System.out.println("\nFormatted Date:");
        for (Locale locale : locales) {
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", locale);
            String formattedDate = date.format(dateFormatter);
            System.out.println(locale.getDisplayName() + ": " + formattedDate);
        }

        // Format and display the currency in each locale
        System.out.println("\nFormatted Currency:");
        for (Locale locale : locales) {
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
            String formattedCurrency = currencyFormatter.format(currencyAmount);
            System.out.println(locale.getDisplayName() + ": " + formattedCurrency);
        }

        scanner.close();
    }
}

