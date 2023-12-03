package practice06;

public class Encapsulation01 {
    /*
    bir class olusturun
    private access mod sahip variablelar olusturun: isim, soyisim, yas seklinde
    parametreli ve parametresiz constructor olusturun
    bu variablelara ait getter setter methodlarını olusturun
    toString methodunu olusturun
     */
//    private access mod sahip variablelar olusturun: isim, soyisim, yas seklinde
    private String isim;
    private String soyisim;
    private int yas;

    //    parametreli ve parametresiz constructor olusturun

    public Encapsulation01() {//parametresiz
        //parametreli olusturunca, default parametsiz gelen constructor i java siler bu yuzden biz tekrar olusturmaliyiz
    }

    public Encapsulation01(String isim, String soyisim, int yas) {//parametreli
        if (isim.charAt(0)>='A'  && isim.charAt(0)<='Z'){
            this.isim=isim;
        }else{
            System.out.println("Isim buyuk harfle baslamali");
        }

        this.soyisim = soyisim;
        if (yas<0){//direk negatif deger girilemesin diye
            System.out.println("Yas degeri negatif olamaz");
        }else{
            this.yas = yas;
        }
    }

    //    bu variablelara ait getter setter methodlarını olusturun

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        //isim kucuk harfle baslamayacak sekilde set methodunu guncelleyin
        if (isim.charAt(0)>='A'  && isim.charAt(0)<='Z'){
            this.isim=isim;
        }else{
            System.out.println("Isim buyuk harfle baslamali");
        }
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        //yas negatif deger alamayacak sekilde set methodunu guncelleyin
        //once kullanıcıdan gelen yas degeri negatif mi diye kontrol edilsin, negatif ise hata mesajı verilip guncelleme yapılmasın
        //negatif degil ise yas degeri guncellensin
        if (yas<0){
            System.out.println("Yas degeri negatif olamaz");
        }else{
            this.yas = yas;
        }//bu kodu parametresiz constructorun oldugu yere de koyduk, constructorun icinde de direk negatif girebiklir diye bunu engellemek icin
    }

    //toString methodunu olusturun


    @Override
    public String toString() {
        return "Encapsulation01{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                '}';
    }
    /*
    POJO
    1-private variablelar
    2-parametreli cons
    3-parametresiz cons
    4-getter, setter
    5-toString
     */
}
