package pro.sky.homework216_2.service;

public class IntegerSearch {

    //                    Бинарный поиск в массиве элементов типа Integer
    //                    (Массив должен быть отсортирован по возрастанию заранее)
    public static boolean binaryIntegerSearch(Integer[] arr, int length, Integer element) {
        int min = 0;
        int max = length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (arr[mid].equals(element)) {
                return true;
            }

            if (element < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }

}
