package HomeWork4;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;
// В калькулятор добавьте возможность отменить последнюю операцию.

public class Task3 {
    public static void main(String[] args) {
        int a;
        int b;
        int res = 0;
        String op;
        Scanner sc = new Scanner(System.in);
        a = inputNum("Введите 1е число: ");
        op = inputStr("\nВведите оператор (+, -, *, /): ");
        b = inputNum("Введите 2е число: ");

        Stack<Integer> stack = new Stack<>();
        if (Objects.equals(op, "+")) {
            res = a + b;
        } else if (Objects.equals(op, "-")) {
            res = a - b;
        } else if (Objects.equals(op, "*")) {
            res = a * b;
        } else if (Objects.equals(op, "/")) {
            res = a / b;
        } else
            System.out.printf("Неверный ввод !");

        System.out.println("ответ:" + res);

        stack.push(res);
        while (true) {
            op = inputStr("\n> Введите оператор (+, -, *, /), " +
                    "\n> Либо ведите \"no\" для" +
                    "удаление последнего результата(оператор или no) ");
            if (Objects.equals(op, "no")) {
                System.out.println("удаленное значение: " + stack.pop());
                res = stack.peek();
                System.out.println("Текущее значение: " + res);
            } else {
                b = inputNum("Введите число: ");
                if (Objects.equals(op, "+")) {
                    res = res + b;
                } else if (Objects.equals(op, "-")) {
                    res = res - b;
                } else if (Objects.equals(op, "*")) {
                    res = res * b;
                } else if (Objects.equals(op, "/")) {
                    res = res / b;
                } else
                    System.out.printf("Неверный ввод !");
                stack.push(res);
                System.out.println("ответ = " + res);
            }
        }
    }

    public static int inputNum(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.print(text);
        int num = sc.nextInt();
        return num;
    }

    public static String inputStr(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.print(text);
        String str = sc.nextLine();
        return str;
    }

    public static LinkedList<Integer> reverse(LinkedList<Integer> listInit) {
        LinkedList<Integer> resList = new LinkedList<>();
        for (int i = listInit.size() - 1; i > -1; i--) {
            resList.add(listInit.get(i));
        }
        return resList;
    }

    public static LinkedList<Integer> enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
        System.out.println(list);
        return list;
    }

    public static int dequeue(LinkedList<Integer> list) {
        int temp = list.get(0);
        list.remove(0);
        System.out.println(list);
        return temp;
    }

    public static int first(LinkedList<Integer> list) {
        return list.get(0);
    }
}
