package practice01;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        //kullanıcıdan iki sayı isteyin
        //sayıların ikisi de pozitifse sayıların toplamını yazdırın
        //ikisi de negatifse sayıların çarpımını yazdırın
        //ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın
        //sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci sayıyı giriniz");
        int first=scan.nextInt();
        int second=scan.nextInt();

        if (first>0&&second>0){
            System.out.println(first+second);
        } else if (first<0&&second<0) {
            System.out.println(first*second);
        } else if (first*second<0){
            System.out.println("Farkli isaretli sayilarla islem yapamazsiniz");
        }else {
            System.out.println("0 carpmaya gore yutan elemandir.");
        }
    }
}
