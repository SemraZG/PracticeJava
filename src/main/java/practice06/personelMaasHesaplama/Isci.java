package practice06.personelMaasHesaplama;

public class Isci implements Muhasebe {
    //interface implement edince hata verdi burasu, cunku interfacedeki her methodun override edilmesi gerekiyordu
    /*
    calisan isci ise;
           1- Çalışanın aylık çalışma saatine göre 160 saat üstü  her saat için brüt maaşı 10 dolar artır.
           2- Çalisanin calisma suresi 10 yıl ve uzeri ise maasından %30;
           daha az ise maasindan %20 vergi kesintisi yapılıyor
     */
    @Override
    public double ekMesai(int calismasaaati) {
        if (calismasaaati > 160) {
            System.out.println("Aylik ek mesai ucreti: " + (calismasaaati - 160) * 10);
            return (calismasaaati - 160) * 10;
        } else {
            return 0;
        }
    }

    @Override
    public double vergi(double brutMaas, int calismaYili) {
        if (calismaYili >= 10) {
            System.out.println("Vergi: " + brutMaas * 30 / 100);
            return brutMaas * 30 / 100;
        } else {
            System.out.println("Vergi: " + brutMaas * 20 / 100);
            return brutMaas * 20 / 100;
        }
    }


    public double netMaas(double brutMaas, int calismasaaati, int calismaYili){
        return brutMaas+ekMesai(calismasaaati)-vergi(brutMaas,calismaYili);
    }
}
