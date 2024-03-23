import  java.util.Arrays;

public class main {
    public static void main(String[] args) {

    int[] arrs = { -1, 0, 36, 4, 5, 8, 45 };
    int size = arrs.length;

    for(
    int i = 0;i<size-1;i++)
    {
        int min_index = i;
        for (int j = i + 1; j < size; j++) {
            if (arrs[j] < arrs[min_index]) {

                min_index = j;
            }
        }

        int son = arrs[min_index];
        arrs[min_index] = arrs[i];
        arrs[i] = son;

    }

    System.out.println(Arrays.toString(arrs));
}


}