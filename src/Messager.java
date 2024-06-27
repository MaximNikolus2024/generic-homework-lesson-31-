import java.util.Scanner;

public class Messager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 'str' для строки или 'int' для числа:");
        String type = scanner.nextLine();

        if ("str".equals(type)) {
            System.out.println("Введите строку:");
            String input = scanner.nextLine();
            Message<String> stringMessage = new Message<>();
        }

        else if ("int".equals(type)) {
            System.out.println("Введите число:");
            int input = scanner.nextInt();
            Message<Integer> intMessage = new Message<>();
        } else {
            System.out.println("Неизвестный тип данных.");
        }
    }

       

}
