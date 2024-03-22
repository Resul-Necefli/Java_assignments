


public class arrey {
    public static void main(String[] args) {

    int[] result = { 1, 10, 3, 4 };
    int i = 0;while(i<result.length-1)
    {
        //              int b =0;
        int s = result.length - 1;

        if (result[s] > result[i]) {

            System.out.println("Sorted");

        } else {
            System.out.println("Unsorted");
        }

        i++;
    }

}

}