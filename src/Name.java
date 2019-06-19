import java.util.Scanner;

public class Name {

    String name = "Вячеслав";

    void result() {
        String n;
        do {
            System.out.println("Введите имя: ");
            Scanner MyName = new Scanner(System.in);
            n = MyName.nextLine();
            if (n.equals(name)) {
                System.out.println("Привет, " + n);
                break;
            } else System.out.println("Нет такого имени");
        } while (!(n.equals(name)));
    }

}
