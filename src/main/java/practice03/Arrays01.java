package practice03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
    /*
        3 elemanlı bir array olusturunuz(int)
        Arrayin elemanlarını sıra ile kullanıcıdan alınız, arrayi yazdırınız
        Arrayın elemanlarının ortalamasını bulunuz, ortalamayı yazdırınız
        Ortalamadan daha buyuk olan array elemanlarını yazdırınız

         */
        int [] arr=new int[3];
        Scanner input=new Scanner(System.in);
        for (int i=0; i<arr.length; i++){
            System.out.println("Lutfen Array e eklemek istediginiz sayiyi giriniz");
            arr[i]= input.nextInt();
        }
        System.out.println(Arrays.toString(arr));


        //Arrayın elemanlarının ortalamasını bulunuz, ortalamayı yazdırınız
        double sum=0;
//        for (int i=0; i<arr.length; i++){
//            sum=sum+arr[i];
//        }
//        System.out.println(sum/arr.length);
        //2.way
        for (Integer w: arr) {
            sum=sum+w;
        }
        double ortlm=sum/arr.length;
        System.out.println(ortlm);

        //Ortalamadan daha buyuk olan array elemanlarını yazdırınız
        for (int w: arr){
            if (w>ortlm){
                System.out.print(w+" ");
            }
        }
    }
}
