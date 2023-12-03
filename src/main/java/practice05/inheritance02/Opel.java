package practice05.inheritance02;

public class Opel extends Araba{
    // Opel class'ına gerekli bilgileri, variable ve method olarak yazınız.
    protected String hiz="Opel arabalr max 220 km hiz yaparlar";
    protected String marka="Opel";
    protected String sirketMerkezi="Almanya";
    protected void garanti(){
        System.out.println("Opel arabalar 2 yil garantilidir");
    }

    @Override
    protected void motor() {//parentdaki motor methodubu override ederek Opel e uygun sekilde method body si oliudtirduk
        System.out.println("Opel arabalar Opel marka motor kullanirlar");
    }
}
