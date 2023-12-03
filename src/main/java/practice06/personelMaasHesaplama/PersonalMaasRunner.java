package practice06.personelMaasHesaplama;

public class PersonalMaasRunner {
     /*
    Bir sirketin muhasebe departmanı calısanlarin maaslarini hesaplıyor.
    Muhasebe departmanı maas için su kriterlere bakıyor:

    calisan isci ise;
           1- Çalışanın aylık çalışma saatine göre 160 saat üstü  her saat için brüt maaşı 10 dolar artır.
           2- Çalisanin calisma suresi 10 yıl ve uzeri ise maasından %30;
           daha az ise maasindan %20 vergi kesintisi yapılıyor

    calisan memur ise;
           1- Çalışanın aylık çalışma saatine göre 120 saat üstü  her saat için brüt maaşı 10 dolar artır.
           2- Çalisanin calisma suresi 10 yıl ve uzeri ise maasından %30;
           daha az ise maasindan %25 vergi kesintisi yapılıyor

    Her calisanın maası hesaplanırken bu 2 kritere dikkat edilmek zorundadır

    Bu kriterlere gore interface kullanarak calısanların net maasını hesaplayan kodu yazınız

     */
     public static void main(String[] args) {
         Memur memur=new Memur();
         System.out.println(memur.ekMesai(150));//300.0
         System.out.println(memur.vergi(2000, 11));//600.0

         double memurMaas= memur.netMaas(2000, 150, 11);
         System.out.println(memurMaas);


         Isci isci=new Isci();
         double isciMaas=isci.netMaas(1700,180,8);
         System.out.println(isciMaas);
     }

}
