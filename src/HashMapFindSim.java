import java.util.*;

public class HashMapFindSim {

    static boolean findSim(int[] ar) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        boolean status = false;

        for (int e : ar) {
            if (hm.containsKey(e)) {
                System.out.println("Элемент " + e + " уже существует " + (hm.get(e) + 1) + " раз(а)!");
                hm.put(e, hm.get(e) + 1);
                status = true;
            } else
                hm.put(e, 1);

        }
        if (status)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int[] array = {3, 46, 7, 87, 654, 7, 4, 45, 6, 3, 876, 7, 876, 876, 7};
        System.out.println(findSim(array));

    }
}
