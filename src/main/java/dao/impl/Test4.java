package dao.impl;

public class Test4
{
    public static void main(String[] args) {
        String S="123";
        String S2="123";
        String S3=new String("123");
        System.out.println(S==S2);//true
        System.out.println(S3==S2);//false


    }
}
