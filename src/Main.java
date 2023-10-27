import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст. Для завершения ввода, введите пустую строку.");

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            if (containsTwoDigitNumber(input)) {
                System.out.println(input);
            }
        }

        scanner.close();
    }

    public static boolean containsTwoDigitNumber(String text) {
        Pattern pattern = Pattern.compile("\\b\\d{2}\\b");
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }
}
