public class RegularArray {
    static int[] array = {3, 8, 15, 9, 65, 32, 4, 2, 1};
    static int value;

    static int[] getIndex(int number) {

        for (int i = 0; i < array.length; i++) {
            value = array[i];
            for (int j = i + 1; j < array.length; j++) {
                value += array[j];
                if (value == number)
                    return new int[]{i, j};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] returnedArray = getIndex(74);
        System.out.println(returnedArray[0]+" || "+returnedArray[1]);


    }
}

