import  java.util.Arrays;
import java.util.concurrent.locks.Lock;

public class main {
    public static void main(String[] args) {

    int[] loki = { -1, 0, 36, 4,-10, -50, 8, 45 };
    int size = loki.length;


    for (int i = 0; i < size - 1; i++) {
        int key = i;
        for (int j = i + 1; j < size; j++) {

            if (loki[j] < loki[key]) {

                int result = loki[key];

                loki[key] = loki[j];
                loki[j] = result;

            }
        }
        System.out.println(Arrays.toString(loki));
    }
}




}


