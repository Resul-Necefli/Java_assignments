public class arr {
     public static void main(String[] args) {

          int[] sfera = { 1, 2, 3, 4, 5, 6, 7 };

          int b = 0;
          int s = sfera.length - 1;
          while (b < s) {

               int g = b;
               sfera[b] = sfera[s];
               sfera[s] = g;
               b++;
               s--;

          }

          for (int i = 0; i < sfera.length; i++) {

               System.out.println(sfera[i]);
          }
     }
}