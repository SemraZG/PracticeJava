package practice03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays03 {
    public static void main(String[] args) {
        /*
         * İki Array'de ortak bulunan elementleri yazdırınız.
         * (case sensitivity olmadan)

         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}

         * Output : [brad,sofia,emily]
         */
        String [] inp1={"John","Brad","Angel","Sofia","Emily"};
        String [] inp2={"sofia","brad","grace","emily","hazel","Aycan"};
        List<String> ortaklar=new ArrayList<>();

        for(String w: inp1){
            for (String k: inp2){
                if (w.equalsIgnoreCase(k)){
                    ortaklar.add(w);
                }
            }
        }
        System.out.println((ortaklar));//[Brad, Sofia, Emily]
    }
}
