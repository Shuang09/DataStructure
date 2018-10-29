package basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        System.out.println(1);
        int[] num={1,2,3,4};
        //num.append(5);
        //String []Arrary=[""];
        List<String> list =new ArrayList<String>();
        list.add(1,"dog");
        list.add(2,"cat");
        System.out.println(list);
        System.out.println(Arrays.toString(num));
    }
}
