package dao.impl;

public class Demo2 {
    //String str=new String("喜欢");//创建2个对象
    String str="狗子";//创建2个对象
  char[] ch={'川','东','南'};//数组里面不能存字符串,基本类型不变，引用类型变
    public static void main(String[] args) {
        Demo2 D = new Demo2();
        D.change(D.str,D.ch);//放了引用类型和基本类型
        System.out.println(D.str+"去");//我要去川东南
        System.out.println(D.ch);
    }
    public void change (String str,char ch[]){
        str="我要";
        ch[0]='榕';
    }
}//正确答案：喜欢去榕东南
