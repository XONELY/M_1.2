import java.util.*;

public class HashMapArray {
    public static int[] findIndexes(int[] arr, int number) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = number - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        System.out.println("Нет подходящих значений");
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] array = {3, 46, 7, 87, 654, 8, 4, 45, 6, 876, 8};
        int[] result = findIndexes(array, 16);

        System.out.println("Найдены значения: " + result[0] + " " + result[1]);
    }
}
