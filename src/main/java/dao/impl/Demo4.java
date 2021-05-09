package dao.impl;

import java.io.File;

public class Demo4{
    public static void main(String[] args) {
        a("D:\\");
    }
    //遍历出所有的文件夹下所有文件(递归)2020-06-06
   // String pathname="D:\\";
    private static String a(String pathname) {
        //来一个路径
        File file = new File(pathname);
        //是文件夹
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
              //  file1
            }
            a(pathname);
        }else {
            System.out.println("文件夹名字是"+file.getName()+file.getPath());
        }
        return "nishi";
    }
    public static String b(){
        return "d";
    }
}
