package practice02;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        /* Kullanıcından sisteme bir sayi girmesini isteyiniz,
        kullanıcının girdigi sayıdan baslayarak, 10'un katına gelene kadar ardısık yazdırınız

        Örn: Sayı: 41
        Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= input.nextInt();

        while (number%10!=0){
            System.out.print(number+" " );
            number++;
        }

    }
}
