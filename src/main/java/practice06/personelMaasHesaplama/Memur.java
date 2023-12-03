package practice06.personelMaasHesaplama;

public class Memur implements Muhasebe{
    //interface implement edince hata verdi burasu, cunku interfacedeki her methodun override edilmesi gerekiyordu
    /*
       calisan memur ise;
           1- Çalışanın aylık çalışma saatine göre 120 saat üstü  her saat için brüt maaşı 10 dolar artır.
           2- Çalisanin calisma suresi 10 yıl ve uzeri ise maasından %30;
           daha az ise maasindan %25 vergi kesintisi yapılıyor
     */
    @Override
    public double ekMesai(int calismasaaati) {
        if (calismasaaati>120){
            System.out.println("Aylik ek mesai ucreti: "+(calismasaaati-120)*10);
            return (calismasaaati-120)*10;
        }else{//ek mesai yok demektir
            return 0;
        }
    }

    @Override
    public double vergi(double brutMaas, int calismaYili) {
        if (calismaYili>=10){
            System.out.println("Vergi: "+(brutMaas*30/100));
            return (brutMaas*30/100);
        }else{
            System.out.println("Vergi: "+(brutMaas*25/100));
            return (brutMaas*25/100);
        }
    }

    public double netMaas(double brutMaas, int calismasaati, int calismaYili){
      return  brutMaas+ekMesai(calismasaati)-vergi(brutMaas, calismaYili);

    }
}
