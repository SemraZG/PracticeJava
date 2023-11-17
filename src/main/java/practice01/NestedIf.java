package practice01;
import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
         /*
      Kullanıcıdan sisteme bir numara girmesini isteyin.

      Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.

      Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Rakam" yazdırın,
      10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.

  */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir numara giriniz");
        int num= input.nextInt();

        if (num<0){
            System.out.println("Negatif Sayi");
        }else {
            if (num<10){
                System.out.println("Rakam");
            }else{
                System.out.println("Pozitif Sayi");
            }
        }
    }
}
