package practice03;

import java.util.Scanner;

public class DikUcgenOlusturma {
    public static void main(String[] args) {
        /*
    Kullanıcıdan sisteme satır sayısını girmesini isteyiniz.
    ve ardından aşağıdaki şekli bu sayıya göre yazdırın:
    örnegin: Satır Sayısı 4 icin;
     1
     2 3
     4 5 6
     7 8 9 10
     */
        Scanner input=new Scanner(System.in);
        System.out.println("Olusturulacak ucgenin Satir sayisini giriniz");
        int satir= input.nextInt();
        int a=1;
        for (int i=1; i<=satir; i++){//satirlar icin
            for (int j=1; j<=i; j++){//sutunlar icin
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }

        System.out.println("==========================");

         /*
                  1 2 3 4
                  5 6 7
                  8 9
                  10
         */
        a=1;//a"nin degerini 1 olrak gincelledik yoksa yukaridaki loop uj arttitdigi yerden devam eder
        for (int i=satir; i>=1; i--){//satirlar icin
            for (int j=1; j<=i; j++){//sutunlar icin
                System.out.printf("%-3d",a);
                a++;
            }
            System.out.println();
        }
    }
}
