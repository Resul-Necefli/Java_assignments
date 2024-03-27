package insertion_sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        int[] lend = { 5, 2, -4, 1, 0, 9, -1, -10, 55 };
        int size = lend.length;

        for (int i = 1; i < size; i++) {
            int key = lend[i];
            int j = i - 1;

            while (j >= 0 && key < lend[j]) {
                lend[j + 1] = lend[j];
                --j;
            }

            lend[j + 1] = key;
        }
        System.out.println(Arrays.toString(lend));

    }

}




