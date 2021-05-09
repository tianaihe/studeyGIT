package dao.impl;

public class Test {
    public static void main(String[] args) {
        int i=1;
        i=i++;//1
        int a=i;
        System.out.println("a="+a);//1
        System.out.println(i);//1 虽然输出1，但是实际赋值为2了
        int j=i++;//i 先赋值给j然后再++
        System.out.println("i="+i);//todo   怎么看不懂了？？2
        System.out.println("j="+j);//1
        int k=i+ ++i*i++;//2+ 3*3=11
        System.out.println("i="+ i);//4
        System.out.println("j="+ j);
        System.out.println("k="+ k);
        Test2 test2 = new Test2();
       // test2.a;
    }
}
