package practice04;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
         /*
        multi dimensional array olusturun yazdırın
        daha sonra bu mda 'yi, her bir elemanı iç array elemanlarının toplamına esıt olan tek boyutlu
        bir array haline getirin
        ör-->int [][] arr={{3,4},{1,2},{8,7}} ----> {7,3,15}
         */
        int [][] arr={{3,4},{1,2},{8,7}};// veya int [][] arr=new int[3][2];
        int[] sumArr=new int[arr.length];
        int idx=0;
        for (int[] w: arr){
            for (int k: w){
                sumArr[idx]=sumArr[idx]+k;
            }
            idx++;
        }
        System.out.println(Arrays.toString(sumArr));
    }
}
