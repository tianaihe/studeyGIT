package paixu;

import java.util.*;
import java.util.function.Consumer;

public class bianli {

     static String aaa(Object e){
        System.out.println(e);
        return "";
    }

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        //Collections list1 = new ArrayList<>();
        //因为addall是静态方法
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,78);
        list.addAll(Arrays.asList(1,2,3,4,5,6,"dmkm",8,9,78));
        //todo 那么list1怎么 被迁移被遍历
        //list1.addAll(list);
        //list.addAll(list,1,23,3)

        //todo 看不懂
        list.forEach(new Consumer<Object>() {
            @Override
            public void accept(Object e) {
                System.out.println(222);
            }
        });

        // 这是方法引用，lambda的《特殊写法》，满足：1：静态  2：参数列表一样  3：返回值《类型》（没有返回值的话都可以）一样，就可以去引用他的方法
        list.forEach(bianli::aaa);
        /*
        *   public void println(Object x) {
            String s = String.valueOf(x);
            synchronized (this) {
            print(s);
            newLine();
        }
    }
        *
        * */

        for (Object o : list) {
            System.out.println(o);
        }


      //new Collections();
       // System.out.println();

    }
}
