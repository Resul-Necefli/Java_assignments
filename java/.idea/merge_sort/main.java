package merge_sort;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        // buble sort  ile iki  array siralanir
        int[] son = { 10, 2, 35, 4, 5 };
         int[] geralt = { 11, 2, 55, 7, 6 };
           
        for (int i = 0; i < son.length-1; i++) {
              
            for (int j = 0; j < son.length - i - 1; j++) {
                
                if (son[j] > son[j+1]) {
                    int key = son[j];
                    son[j ] = son[j+1];
                    son[j+1] = key;
                }
            }
        
        }
        
        // System.out.println(Arrays.toString(son));


        for (int i = 0; i < geralt.length; i++) {
            
            for (int j = 0; j < geralt.length - i - 1; j++) {
               
                if (geralt[j] > geralt[j + 1]) {

                    int ssh = geralt[j];
                    geralt[j] = geralt[j + 1];
                    geralt[j+1] = ssh;
                }
                
            }
        }
        
        // System.out.println(Arrays.toString(geralt));

          int[] united = new int[son.length + geralt.length];
 
        int son_index = 0;
        int geralt_index = 0;
        int united_index = 0;
         
        while (son_index < son.length && geralt_index < geralt.length) {
            if (son[son_index] < geralt[geralt_index]) {

                united[united_index] = son[son_index];
                son_index++;

            } else {
                united[united_index] = geralt[geralt_index];

                geralt_index++;

            }
            
            united_index++;


        }
        
        while (son_index < son.length) {
            united[united_index] = son[son_index];
           
            son_index++;
            united_index++;


        }
        

        while (geralt_index < geralt.length) {

            united[united_index] = geralt[geralt_index];
            geralt_index++;
            united_index++;

        }
        
        System.out.println(Arrays.toString(united));
    }
    
}
