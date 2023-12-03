package practice04;

import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        /*
        Basit 4 islem yapan bir hesap makinesi kodlayınız
        Kullanıcıcn yapacagi islemi islem sembolu ile( +  -  /  *  ) secmesini isteyiniz
        Kullanıcının 2 sayi girmesini isteyiniz
        Girilen islem ve sayilara gore dogru sonucu ekrana yazdırınız
        */
        Scanner input=new Scanner(System.in);
        System.out.println("----Hesap Makinasina Hosgeldiniz----");
            System.out.println("Lutfen yapmak istediginz islemi seciniz----- +, -, /, *");
            char islem= input.next().charAt(0);
            if (islem=='+'|| islem=='-'|| islem=='/'||islem=='*'){
                System.out.println("1. sayiyi giriniz");
                double firstNum= input.nextDouble();
                System.out.println("2. sayiyi giriniz");
                double secNum= input.nextDouble();

                hesapMakinasi(islem,firstNum,secNum);

            }else{
                System.out.println("Lutfen belirtilen islemlerden birini seciniz");
            }

    }

    public static void hesapMakinasi(char islem, double firstNum, double secNum) {
        switch (islem){
            case '+':
                System.out.println(firstNum+"+"+secNum+"="+(firstNum+secNum));
                break;
            case '-':
                System.out.println(firstNum+"-"+secNum+"="+(firstNum-secNum));
                break;
            case '/':
                System.out.println(firstNum+"/"+secNum+"="+(firstNum/secNum));
                break;
            case '*':
                System.out.println(firstNum+"*"+secNum+"="+(firstNum*secNum));
                break;
        }


    }


}
