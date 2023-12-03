package practice03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arrays04 {
    public static void main(String[] args) {
        /*
          Kullanıcıdan alınan cümledeki en uzun kelimeyi(veya kelimeleri) listeleyen bir kod yazınız.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String s=input.nextLine().replaceAll("[, .]", "");
        String [] sList= s.split(" ");

        int max=0;

        for (String w: sList){
            max=Math.max(w.length(), max);
        }
        //kelimeler arrayindeki elemanları tek tek alalım, uzunlukları max uzunluga esit mi diye bakalım
        //esit ise enUzunKelimeler'e ekleyelim
        List<String> enUzunKelimeler=new ArrayList<>();

        for (String w: sList){
            if (w.length()==max){
                enUzunKelimeler.add(w);
            }
        }
        System.out.println(enUzunKelimeler);


    }
}
