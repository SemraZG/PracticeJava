package practice06;

import java.util.HashMap;
import java.util.Map;

public class Map01 {
    /*
       İki farklı Array'de aynı indekste barındırırılan ad ve soyadları örnekteki gibi yazdıran bir kod yazınız.
       input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
       output : {John=Doe, Mark=Twain, Ali=Can};
        */
    public static void main(String[] args) {

    String[] isim={"John", "Mark", "Ali"};
    String[] soyisim={"Doe", "Twain", "Can"};
    Map<String, String> isimSoyisim=new HashMap<>();

    for (int i=0; i< isim.length; i++){
        isimSoyisim.put(isim[i],soyisim[i]);
    }

        System.out.println(isimSoyisim);//{John=Doe, Mark=Twain, Ali=Can}




    }
}
