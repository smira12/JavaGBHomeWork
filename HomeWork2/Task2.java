package HomeWork2;
// Дана строка (получение через обычный текстовый файл!!!)
// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder,
// создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {

        String pathFile = "JavaGBHomeWork/HomeWork2/Task2_data.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {

            String line;

            while ((line = br.readLine()) != null) {

                StringBuilder result = new StringBuilder();

                String[] parts = line.split(",");

                for (String part : parts) {

                    String[] kv = part.split(":");

                    if (kv[0].equals("\"фамилия\"")) {

                        result.append("Студент ").append(kv[1].replaceAll("\"", "")).append(" ");

                    } else if (kv[0].equals("\"оценка\"")) {

                        result.append("получил ").append(kv[1].replaceAll("\"", "")).append(" ");

                    } else if (kv[0].equals("\"предмет\"")) {
                        result.append("по предмету ").append(kv[1].replaceAll("\"", "")).append(".");
                    }
                }
                System.out.println(result.toString());
            }
        } catch (
                IOException ex) {
            ex.printStackTrace();
        }
    }
}
