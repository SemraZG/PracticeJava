package practice02;

public class YildizdanSekilOlusturma {
    public static void main(String[] args) {
        /*
                 *
                 * *
                 * * *
                 * * * *
                 * * * * *
                 * * * *
                 * * *
                 * *
                 *
         */
        int sayi=5;
        for (int i=0; i<sayi; i++){
            for (int k=0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=sayi-1; i>0; i--){
            for (int k=0; k<i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
