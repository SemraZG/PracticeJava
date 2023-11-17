package practice02;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        /*
          Kullanicidan toplanmak uzere pozitif tamsayilar isteyin,
          Kullaniciya bitirmek istediginde 0'a basmasini soyleyin

          kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini,
          ve bunlarin toplaminin kac oldugunu yazdirin

          Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin,
          bu negatif sayiyi sayi adedine ve toplama eklemeyin

         */

        Scanner inp=new Scanner(System.in);

        int sum=0;
        int numOfNumbers=0;
        System.out.println("When you want to finish the game please enter 0");

        do {
            System.out.println("Enter a positive digit");
            int num= inp.nextInt();
            if (num==0){
                break;
            } else if (num<0) {
                System.out.println("You should not enter negative number");
                continue;
            }else{
                numOfNumbers++;
                sum+=num;
            }

        } while (true);

        System.out.println("sum "+sum);
        System.out.println("numOfNumbers "+numOfNumbers);
    }
}
