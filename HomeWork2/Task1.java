package HomeWork2;
//Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
//        результат после каждой итерации запишите в лог-файл.


import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        // Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
        // результат после каждой итерации запишите в лог-файл.

        int[] numsArr = {1, 3, 67, 2, 43, 56, 3, 8, 9, 10};

        arrSort(numsArr, "log_file.txt");
        System.out.println();
        System.out.println("Данные отсортированы: " + Arrays.toString(numsArr));

    }

    static int[] arrSort(int[] array, String nameFile) {
        File file = new File(nameFile);

        int n = 1;
        while (n < array.length) {
            for (int i = 0; i < array.length - n; i++) {

                if (array[i] > array[i + 1]) {
                    int numTemp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = numTemp;

                }
                try {
                    FileWriter writer = new FileWriter(file, true);
                    writer.append(String.valueOf(array[i]));
                    writer.append("\n");
                    writer.flush();
                } catch (Exception ex) {
                    System.out.println("Что то пошло не так! ");
                }
            }
            n++;
        }
        return array;
    }
}
