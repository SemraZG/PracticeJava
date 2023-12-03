package practice06;

public class Encapsulation01Runner {
    public static void main(String[] args) {
        //Ali, Can, 25 ozelliklerine sahip bir obje olusturunuzz ve yazdırınız
        Encapsulation01 e1=new Encapsulation01("Ali","Can",25);//parametreli constructor sayesinde direk objenin icine yazdik
        System.out.println(e1.getIsim());
        System.out.println(e1.getSoyisim());
        System.out.println(e1.getYas());//25
        System.out.println(e1.toString());//toString i yazmasak da objenin ozellikleri yine de yazdirilir

        //objenin yasını 30 olarak guncelleyin
        e1.setYas(30);
        System.out.println(e1.getYas());//30

        //parametresiz cons kullanarak 2. bir obje olusturun
        Encapsulation01 e2=new Encapsulation01();
        System.out.println(e2);//Encapsulation01{isim='null', soyisim='null', yas=0}
        ////Ayse, Yilmaz, 40 degerlerini atayın
        e2.setIsim("Ayse");
        e2.setSoyisim("Yilmaz");
        e2.setYas(40);
        System.out.println(e2);//Encapsulation01{isim='Ayse', soyisim='Yilmaz', yas=40}
        //yas'ı -5 olarak guncelleyin
        e2.setYas(-5);
        System.out.println(e2);

        //yas negatif deger alamayacak sekilde set methodunu guncelleyin--setYas methodu
        //isim kucuk harfle baslamayacak sekilde set methodunu guncelleyin
        //isim kucuk harfle baslamayacak sekilde parametreli constructoru guncelleyin
    }
}
