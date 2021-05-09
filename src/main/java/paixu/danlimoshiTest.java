package paixu;

public class danlimoshiTest {
    //todo 私有的构造函数，否则所有类都可以调用就不是单例模式
    private danlimoshiTest(){

    }
    //todo 只能自己调用自己实例化返回对象
    public danlimoshiTest huoqushili(){
        return new danlimoshiTest();
    }
    private static void a(){
        System.out.println("");
    }
}
