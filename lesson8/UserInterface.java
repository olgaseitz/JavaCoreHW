package lesson8;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class UserInterface {
    private Controller controller = new Controller();

    public void runInterface() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите имя города: ");
            String city = scanner.nextLine();

            System.out.println("Введите 1 для получения погоды на сегодня;" +
                    "Введите 5 для прогноза на 5 дней; Введите 2 для получения данных из базы; Для выхода введите 0:");

            String command = scanner.nextLine();

            if (command.equals("0")) break;

            try {
                controller.getWeather(command, city);
            } catch (IOException | SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
