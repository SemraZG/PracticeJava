package practice01;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
          /*
            Kullanıcıdan bir sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= input.nextInt();

        Object result=(num%2==0) ? "Cift Sayi" : (num+3);
        System.out.println("result = " + result);

         /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayıyının karesini ekrana yazdırın.
         */
        System.out.println("Lutfen 2 sayi giriniz");
        int digit1=input.nextInt();
        int digit2= input.nextInt();
        Object result2= (digit1==digit2 ? ("Sayilar esit") : (digit1<digit2 ? (digit2*digit2) : (digit1*digit1)));
        System.out.println(result2);
    }
}
