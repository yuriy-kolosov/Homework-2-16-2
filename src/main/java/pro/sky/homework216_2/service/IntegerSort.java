package pro.sky.homework216_2.service;

import static pro.sky.homework216_2.service.IntegerUtilities.swapIntegerElements;

public class IntegerSort {

    //                  Пузырьковая сортировка
    public static void sortIntegerBubble(Integer[] arr, int length) {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapIntegerElements(arr, j, j + 1);
                }
            }
        }
    }

    //                  Сортировка выбором
    public static void sortIntegerSelection(Integer[] arr, int length) {
        for (int i = 0; i < length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            swapIntegerElements(arr, i, minElementIndex);
        }
    }

    //                  Сортировка вставкой
    public static void sortIntegerInsertion(Integer[] arr, int length) {
        for (int i = 1; i < length; i++) {
            Integer temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

}
