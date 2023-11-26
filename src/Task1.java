import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа через запятую: ");
        String input = scanner.nextLine();

        String[] numbers = input.split(", ");
        Set<String> uniqueNumbers = new HashSet<>();

        for (String number : numbers) {
            uniqueNumbers.add(number);
        }

        System.out.print("Получившаяся строка: ");
        for (String uniqueNumber : uniqueNumbers) {
            System.out.print(uniqueNumber + " ");
        }
    }
}
