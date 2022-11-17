import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> purchases = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите операцию или введи end для завершения:\n 1. Добавить \n 2. Показать \n 3. Удалить");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }

            int yourChoice = Integer.parseInt(input);


            switch (yourChoice) {
                case 1:
                    System.out.println("Какую покупку хотите доабвить?");
                    input = scanner.nextLine();
                    purchases.add(input);
                    System.out.println("Итого в списске покупок: " + purchases.size());
                    break;
                case 2:
                    System.out.println("Список покупок:");
                    print(purchases);
                    break;
                case 3:
                    System.out.println("Список покупок:");
                    print(purchases);
                    System.out.println("Какую хотите удалить? Введите номер или название");
                    input = scanner.nextLine();
                    if (isNumeric(input)) {
                        int deleteNumber = Integer.parseInt(input);
                        purchases.remove(deleteNumber - 1);
                    } else {
                        purchases.remove(input);
                    }
                    System.out.println(purchases);
                    break;
                default:
                    System.out.println("Такой операции нет!");
            }
        }
    }

    public static void print(ArrayList<String> purchases) {
        for (int i = 0; i < purchases.size(); i++) {
            String purchase = purchases.get(i);
            System.out.println((purchases.indexOf(purchase)) + 1 + ". " + purchase);
        }
    }

    protected static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
