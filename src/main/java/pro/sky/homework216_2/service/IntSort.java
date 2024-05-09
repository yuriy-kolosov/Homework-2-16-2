package pro.sky.homework216_2.service;

public class IntSort {

    //                  Пузырьковая сортировка (на тесте в 100 000 элементов - 14943мс - третье место)
    public static void sortIntBubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapIntElements(arr, j, j + 1);
                }
            }
        }
    }

    //                  Сортировка выбором (на тесте в 100 000 элементов - 3402мс - второе место)
    public static void sortIntSelection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            swapIntElements(arr, i, minElementIndex);
        }
    }

    //                  Сортировка вставкой (на тесте в 100 000 элементов - 663мс - самая быстрая)
    public static void sortIntInsertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }


    //                  Перестановка элементов
    public static void swapIntElements(int[] arr, int indexA, int indexB) {
        int tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }

    //                  Генерация массива псевдослучайных элементов типа Integer
    public static int[] generateRandomIntArray(int length) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[length];
        int bound = 100_000;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(bound) + 100_000;
        }
        return arr;
    }

}
