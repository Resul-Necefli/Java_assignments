import  java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class main {
    public static void main(String[] args) {

        int[] arr = {4, 0, 36, -1, 5, 8, 45,-10,-5,89};
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {


            for (int j = 0; j < size - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int asd = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = asd;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}