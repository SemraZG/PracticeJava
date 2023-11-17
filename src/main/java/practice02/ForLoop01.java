package practice02;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {
        /*
            Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
             //  babacan -->2
           */
    Scanner input =new Scanner(System.in);
        System.out.println("Please enter a word");
    String word=input.next().toLowerCase();
    int howManyA=0;
    for (int i=0; i<word.length(); i++){
        if (word.charAt(i)=='c'){
            break;
        }else if (word.charAt(i)=='a') {
              howManyA++;
          }
        }
        System.out.println(howManyA);

    }

}
