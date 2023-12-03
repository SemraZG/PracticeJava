package practice03;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        /*
        verilen arraye istenen bir elemanı ekleyen bir kod yazınız
        int [] arr={1,4,7,11};
        eklenecek eleman = 5 ;
         */
        int [] arr={1,4,7,11};
        int eklenecek=5;
        //Arraye e yeni eleman eklenemeyecegi icin ayni uzunluktan bir fazla elemanlli baska bir Array olusturuyoruz
        int [] brr=new int[arr.length+1];
//        for (int i=0; i<arr.length; i++){
//            brr[i]=arr[i];
//        }
//        System.out.println(Arrays.toString(brr));//[1, 4, 7, 11, 0]
//        brr[arr.length]=eklenecek;
//        System.out.println(Arrays.toString(brr));//[1, 4, 7, 11, 5]
//        arr=brr;
//        System.out.println(Arrays.toString(arr));//[1, 4, 7, 11, 5]

        //2.way
        int idx=0;
        for (int w: arr){
            brr[idx]=w;
            idx++;
        }
        brr[brr.length-1]=eklenecek;
        System.out.println(Arrays.toString(brr));
        arr=brr;
        System.out.println(Arrays.toString(arr));


    }
}
