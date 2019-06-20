import java.util.Scanner;

public class Hello {

    int a, num = 7;

    void resultEnterNumber() {
        Scanner MyNum = new Scanner(System.in);
        System.out.print("Введите число: ");
        do {
            int a = MyNum.nextInt();
            if (a > num) {
                System.out.println("Привет");
                break;
            } else System.out.print("Введите число: ");
        } while (!(a > num));
    }
}