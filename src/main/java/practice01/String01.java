package practice01;

import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {

     /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
    ali can
      */
        Scanner input=new Scanner(System.in);
        System.out.println("Ad ve soyadinizi aralarinda bosluk olacak sekilde giriniz"+
                "\nNot:Sadece bir ad ve bir soyad giriniiz");
        String fullName=input.nextLine().trim();
        String name=fullName.split(" ")[0];
        String lastName=fullName.split(" ")[1];
        name= name.toUpperCase().charAt(0)+name.toLowerCase().substring(1);
        lastName=lastName.toUpperCase().charAt(0)+lastName.toLowerCase().substring(1);
        System.out.println("name = " + name);
        System.out.println("lastName = " + lastName);

    }
}
