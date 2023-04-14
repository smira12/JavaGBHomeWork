package HomeWork1;
//Вывести все простые числа от 1 до 1000

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int input = scan.nextInt();
        scan.close();
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= input; i++) {
            boolean myNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    myNumber = false;
                    break;
                }
            }
            if (myNumber) {
                primes.add(i);
            }
        }
        System.out.println("Простые числа: " + primes);
    }
}
