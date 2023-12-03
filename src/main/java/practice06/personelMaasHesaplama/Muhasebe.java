package practice06.personelMaasHesaplama;

public interface Muhasebe {
    //ekMesai ve vergi diye 2 abstract method olusturalim

    public abstract double ekMesai(int calismasaaati);
    //interface in icindeki her method zaten public ve abstract oldugu icin bunlari yazmasak da olur
    double vergi(double brutMaas, int calismaYili);//==public abstract double vergi();


}
