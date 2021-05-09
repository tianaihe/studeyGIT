package dao.impl;

public class ee {
    //1.无返回值的多参接口
   // @FunctionalInterface
    public interface LambdaNoneReturnMultipleParameter {
        void test(int a, int b);
    }
    //2.无返回值的无参接口
    //@FunctionalInterface
    public interface LambdaNoneReturnNoneParameter {
        void test();
    }
    //3.无返回值的一参接口

    public interface LambdaNoneReturnSingleParameter {
        void test(int n );
    }

    //4.有返回值的多参接口

    public interface LambdaSingleReturnMultipleParameter {
        int test(int a, int b);
    }
    //5.有返回值的无参接口

    public interface LambdaSingleReturnNoneParameter {
        int test();
    }
    //6.有返回值的一参接口

    public interface LambdaSingleReturnSingleParameter {
        int test(int n);
    }
//匿名内部类
    public static void main(String[] args) {
        LambdaNoneReturnMultipleParameter lambdaNoneReturnMultipleParameter = new LambdaNoneReturnMultipleParameter(){

            @Override
            public void test(int a, int b) {
                System.out.println("我是匿名内部类");
            }
        };//todo 如果接口写了好多个方法我要用哪个
        lambdaNoneReturnMultipleParameter.test(2,3);
        //lambda
        LambdaNoneReturnMultipleParameter LambdaNoneReturnMultipleParameter2 = (a,b) -> {
            System.out.println("ddkcm");
        };//todo 这个后面不能，test？
        //LambdaNoneReturnMultipleParameter2.test(1,2);
    }

}
