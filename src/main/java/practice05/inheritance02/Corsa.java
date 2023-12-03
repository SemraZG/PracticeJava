package practice05.inheritance02;

import java.util.ArrayList;
import java.util.List;

public class Corsa extends Opel{
    String hiz="Corsa arabalar max 200km hiz yaparlar";
    String yakit="Corsa arabalar benzinlidir";
    String model="Corsa";
    protected void vitesSayisi(){
        System.out.println("Corsa 5 viteslidir");
    }

    @Override
    protected void motor() {
        System.out.println("Corsa arabalar cevreci motor kullanır");
    }

    @Override
    protected void yakitTuketimi() {
        System.out.println("Corsa arabalar 5.6 lt yakit tuketir");
    }

    //main method
    public static void main(String[] args) {
       Corsa corsa=new Corsa();
        System.out.println(corsa.hareket);//Arabalr teker ile hareket eder.--Araba clasiindan geldi cunku kendi clasinda da bir ust parenttinda da yok
        System.out.println(corsa.hiz);//Corsa arabalar max 200km hiz yaparlar
        System.out.println(corsa.yakit);
        System.out.println(corsa.marka);
        System.out.println(corsa.sirketMerkezi);
        System.out.println(corsa.model);
        corsa.motor();

        Opel opel=new Corsa();//constructor i child dan sectik, ama obje Opel classdan olusturuldugu icin once oraya bakar
        List<String> list=new ArrayList<>();//burda da constructor childdan secilmis
        System.out.println(opel.hareket);//Arabalr teker ile hareket eder.
        System.out.println(opel.hiz);//Opel arabalr max 220 km hiz yaparlar
        System.out.println(opel.yakit);
        System.out.println(opel.marka);
        //opel.model;--constructor child olsa da childdaki fieldlari parent kullanamaz


        opel.motor();//Corsa arabalar cevreci motor kullanır----Childindaki method bodysini yazdirdi cunku;
            //methodlarda da parenda dogru bir arama yapiliyor bulunca override edilip edilmedigine bakiyor edilmisse edilen childa gidip onu yazdiriyor

    /*
        inheritance da variable lar;
        aramaya data turu neyse oradan baslar,
        bulamazsa parenta bakar,
        ilk buldugu yerden alır
         */
        /*
        inheritance da methodlar;
        aramaya data turu ne ise oradan baslar,
        bulamazsa parenta bakar,
        ilk buldugunu almaz
        constructor'ın oldugu classa kadar override edilmiş mi diye bakar
        son buldugu yerden alır
         */
        //arama işlemi variable ve methodlar için asagıdan yukarı dogrudur
        //override kontrol işlemi ise yukarıdan asagı dogrudur
    }
}
