package practice04;

public class Varargs {
    public static void main(String[] args) {
        // kac tane kelime verilirse verilsin
        // iclerinden en uzun olanı yazdıran bir method olusturun
        String str1="Ali";
        String str2="Abdurrahman";
        String str3="Mustafa";
        String str4="Cemil";
        String str5="Yusuf";
        String str6="Yasemin";

        enUzunKelimeyiYazdir(str1,str2,str3);
        enUzunKelimeyiYazdir(str3,str4,str5,str6);
    }

    private static void enUzunKelimeyiYazdir(String ... str) {
        String enUzunKelime="";
        for (String w: str){
            if (w.length()>enUzunKelime.length()){
                enUzunKelime=w;
            }
        }
        System.out.println(enUzunKelime);
    }
}
