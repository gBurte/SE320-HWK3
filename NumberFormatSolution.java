import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatSolution {
    public static void main(String[] args) {
        // a. Formatting number 12345.678 in the United Kingdom locale with two digits after the decimal point
        double numberToFormat = 12345.678;
        Locale ukLocale = Locale.UK;
        NumberFormat ukFormat = NumberFormat.getNumberInstance(ukLocale);
        ukFormat.setMinimumFractionDigits(2);
        ukFormat.setMaximumFractionDigits(2);

        String formattedUK = ukFormat.format(numberToFormat);
        System.out.println("Question 3 Part.a. Formatted in UK Locale: " + formattedUK);

        // b. Formatting number 12345.678 in U.S. currency
        Locale usLocale = Locale.US;
        NumberFormat usCurrencyFormat = NumberFormat.getCurrencyInstance(usLocale);

        String formattedUSCurrency = usCurrencyFormat.format(numberToFormat);
        System.out.println("Question 3 Part.b. Formatted as U.S. Currency: " + formattedUSCurrency);

        // c. Parsing '12,345.678' into a number
        String numberStr = "12,345.678";
        try {
            NumberFormat numberFormat = NumberFormat.getNumberInstance();
            Number parsedNumber = numberFormat.parse(numberStr);
            double parsedDouble = parsedNumber.doubleValue();
            System.out.println("Question 3 Part.c. Parsed Number: " + parsedDouble);
        } catch (ParseException e) {
            System.err.println("Error parsing the number: " + e.getMessage());
        }
    }
}