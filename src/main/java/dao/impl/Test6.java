package dao.impl;

public class Test6 {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "abc";
        System.out.println(s1 + s2);//nullabc
        String str1 = new String("hello");
        String str2 = new String("hello");
        String str3 = new String("world");
        System.out.println(str1==str2);//false
        String a="hello"+"world";
        String a2="helloworld";
        System.out.println(a==a2);//true
        String S2 = "This is only a";
        String S3 = " simple";
        String S4 = " test";
        String S1 = S2 +S3 + S4;
        String S6= "This is only a simple test";
        System.out.println(S1==S6);//FALSE

    }
}
