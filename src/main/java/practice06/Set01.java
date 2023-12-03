package practice06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set01 {
    // Verilen bir array'den tekrar eden elemanları silip unique elemanlardan olusan bir array haline donusturen method olusturun
    // int arr[]={1,2,2,3,4,4,5};

    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,5};
        arr=arraydenUniqueElemenlariGetir(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]


    }//main disi



    public static int[] arraydenUniqueElemenlariGetir(int [] arr){
        Set<Integer> unique=new HashSet<>();//Setler zaten unique elemanlar tuttugu icin direk Set'in icine attik
        for (int w: arr){
            unique.add(w);
        }
        System.out.println(unique);
        int[] brr=new int[unique.size()];
        int idx=0;
        for (Integer w: unique){
            brr[idx]=w;
            idx++;
        }
        return brr;
    }







}
