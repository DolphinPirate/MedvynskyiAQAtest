public class Main {

    public static void main(String[] args) {

        Hello TaskOne = new Hello();
        Name TaskTwo = new Name();
        MyArray TaskThree = new MyArray();

        System.out.println("\nTask 1:  если введенное число больше 7, то вывести “Привет”");
        TaskOne.result();
        System.out.println("\nTask 2:   если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести \"Нет такого имени\"");
        TaskTwo.result();
        System.out.println("\nTask 3:   на входе есть числовой массив, необходимо вывести элементы массива кратные 3");
        TaskThree.result();

        System.out.println("\nTask 4.\tДана скобочная последовательность: [((())()(())]]\n" +
                "- Можно ли считать эту последовательность правильной?\n" +
                "- Если ответ на предыдущий вопрос “нет” - то что необходимо в ней изменить, чтоб она стала правильной?\n");
        System.out.println("????Ответ: []((())()(()))[]\n" + "\t добавить закрытую ] в начале, добавть закрытую ), заменить закрытую [ на открытую ] ");

    }
}
