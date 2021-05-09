package paixu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class cianchenger {
    public static void main(String[] args) {

    }
    public static Object xian(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                List<String> strings = new ArrayList<String>();
               // strings.asList();
            }
        });
        return "1";
    }
}
