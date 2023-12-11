package org.example;

public class Main {
    public static void main(String[] args) {
        String phoneNumber = "(+380)96-394-98-32";
        boolean result = phoneNumber.matches("\\(\\+380\\)\\d{2}-\\d{3}-\\d{2}-\\d{2}");
        System.out.println(phoneNumber + " -- " + result);

        String text = "Я хочу    бути     програмістом";
        System.out.println(text.replaceAll("\\s+", " "));

        text = "<div>\n" +
                "<p>Символи круглих дужок <code>'('</code> та <code>')'</code>. <br />Ці символи\n" +
                "дозволяють отримати з рядка додаткову інформацію.\n" +
                "<br/>Зазвичай, якщо парсер регулярних виразів шукає в тексті інформацію\n" +
                "за заданим виразом і знаходить її - він просто повертає\n" +
                "знайдений рядок.</p>\n" +
                "<p align=\"right\">А ось тут <a href=\"google.com\">посилання</a>, щоб життя медом не здавалося.</p>\n" +
                "</div>";

        System.out.println(text.replaceAll("<[^>]+>", ""));

    }
}