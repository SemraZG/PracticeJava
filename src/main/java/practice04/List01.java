package practice04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
         /*
    Bir list olusturunuz. 1'den 15'e kadar sayıları bu liste ekleyiniz.
    Daha sonra 10'dan buyuk olan tum elemanları 2 katına cıkarınız
    */

        List<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        for (Integer w: nums){
            if (w>10){
                nums.set(nums.indexOf(w), w*2);
                //set() methodu ile 1. parametrede verilen indextedi elemani 2. parametredekiyle degistir demek
            }
        }
        System.out.println(nums);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 22, 24, 26, 28, 30]
    }
}
