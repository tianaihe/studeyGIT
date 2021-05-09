package paixu;

import java.util.function.Supplier;

public class njhn {
    public static void main(String[] args) {
        int integer = getNumber().get();
//        Supplier<Integer> supplier = getNumber();
//        supplier.get()
        System.out.println(integer);
    }
    //todo zheshi干嘛
    // 前端闭包：大概的意思是--两个不同的方法，之间可以相互访问参数
    private static Supplier<Integer> getNumber(){
        int num=10;
        return () -> num;
    }
}
