package practice05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDatee {
    public static void main(String[] args) {
         /*
        Ali 29.10.1923 tarihinden 45 yıl 8 ay 5 gun sonra dogdu.
        Veli  15.09.1993 tarihinden 24 yil 2 ay 11 gun once dogdu.
        Ali ve Veli'nin dogum tarihini hesaplayıp yazdırınız.
        Alinin dogum gununu 23/11/15 formatına benzer bir sekilde yazdırın

        Ali ve Veli'nin dogum tarihlerinin aynı olup olmadıgını kontrol eden kodu yazınız
         */
        LocalDate localDate=LocalDate.of(1923,10,29);
        LocalDate aliDate=localDate.plusYears(45).plusMonths(8).plusDays(5);
        LocalDate localDate2=LocalDate.of(1993,9,15);
        LocalDate veliDate=localDate2.minusYears(24).
                minusMonths(2).minusDays(11);
        System.out.println(aliDate);
        System.out.println(veliDate);

        //Alinin dogum gununu 23/11/15 formatına benzer bir sekilde yazdırın
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yy/M/d");
        System.out.println(aliDate.format(dtf));

        //Ali ve Veli'nin dogum tarihlerinin aynı olup olmadıgını kontrol eden kodu yazınız
        if (aliDate.equals(veliDate)){
            System.out.println("Ayni tarihte dogmuslar");
        }else{
            System.out.println("Ayni tarihte dogammislar");
        }
    }
}
