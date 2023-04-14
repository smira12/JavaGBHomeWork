package HomeWork1;

import java.util.Scanner;

//1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int i = scan.nextInt();
        System.out.println(myNumber(i));
        scan.close();
    }

    static int myNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}
