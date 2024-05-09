package pro.sky.homework216_2.service;

public class IntegerUtilities {

    //                  Генерация массива псевдослучайных элементов типа Integer
    public static Integer[] generateRandomIntegerArray(int length) {
        java.util.Random random = new java.util.Random();
        Integer[] arr = new Integer[length];
        int bound = 100_000;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(bound) + 100_000;
        }
        return arr;
    }

    //                  Перестановка элементов массива
    public static void swapIntegerElements(Integer[] arr, int indexA, int indexB) {
        Integer tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }

}
