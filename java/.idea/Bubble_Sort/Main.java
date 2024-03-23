import  java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = { -1, 0, 36, 4, 5, 8, 45 };
        int size = arr.length;

        for (int j = 0; j < size - 1; j++) {

            if (arr[j] > arr[j + 1]) {

                int asd = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = asd;

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}