package practice02;


import java.util.Scanner;

public class ForLoop02 {
    /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayılardan birler basamagı 7 veya 9 olanlar hariç diğerlerinin toplamını bulunuz
        */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int sum=0;

        for (int i=1; i<6; i++){
            System.out.println("Enter a number");
            int number= input.nextInt();
            if (number%10==7|| number%10==9){
                continue;
            }
            sum=sum+number;

        }
        System.out.println(sum);



    }
  }
