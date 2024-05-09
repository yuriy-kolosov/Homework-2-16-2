package pro.sky.homework216_2;

import java.util.Arrays;

import static pro.sky.homework216_2.service.IntSort.*;

public class Main {
    public static void main(String[] args) {
        //                                              Домашнее задание 2-16. Основы алгоритмов. Часть 2
        System.out.println("Домашнее задание 2-16. Основы алгоритмов. Часть 2");
        System.out.println();

        //      Анализ времени выполнения разных типов сортировок целочисленных массивов:
        //                                          1) пузырьковая
        //                                          2) выбором
        //

        int intArrayLength = 100000;

        int[] intTestArray1 = generateRandomIntArray(intArrayLength);
        int[] intTestArray2 = Arrays.copyOf(intTestArray1, intArrayLength);
        int[] intTestArray3 = Arrays.copyOf(intTestArray1, intArrayLength);


        System.out.println("Анализ времени выполнения разных типов сортировок целочисленных массивов");
        System.out.println("размером " + intArrayLength + " элементов:");
        System.out.println();

        //      1) Сортировка пузырьковая
        System.out.println("1) Пузырьковая сортировка: время выполнения (мс):");
        long start1 = System.currentTimeMillis();
        sortIntBubble(intTestArray1);
        System.out.println(System.currentTimeMillis() - start1);
        System.out.println();

        //      2) Сортировка выбором
        System.out.println("2) Сортировка выбором: время выполнения (мс):");
        long start2 = System.currentTimeMillis();
        sortIntSelection(intTestArray2);
        System.out.println(System.currentTimeMillis() - start2);
        System.out.println();

        //      3) Сортировка вставкой
        System.out.println("3) Сортировка вставкой: время выполнения (мс):");
        long start3 = System.currentTimeMillis();
        sortIntInsertion(intTestArray3);
        System.out.println(System.currentTimeMillis() - start3);
        System.out.println();

    }

}
