package paixu;

import java.text.Collator;
import java.util.*;

public class paixu {


    public static void main(String[] args) {
        List<Student> stus = new ArrayList<Student>(){
            {
                add(new Student("张三", 30));
                add(new Student("李四", 20));
                add(new Student("王五", 60));
            }
        };
        //todo LIST 和collection的区别
        //@NonNull可以标注在方法、字段、参数之上，表示对应的值不可以为空@nollable反之

       // Collections.sort(stus,);
        // 1.对学生集合按年龄进行排序
        Collections.sort(stus, new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                // 升序
                return s1.getAge()-s2.getAge();
                //return s1.getAge().compareTo(s2.getAge());
                // 降序
                // return s2.getAge()-s1.getAge();
                // return s2.getAge().compareTo(s1.getAge());
            }
        });



    // 2.对学生集合按姓名首字母排序
   /* Comparator comparator = Collator.getInstance(Locale.CHINA);
		Collections.sort(stus, new Comparator<Student>() {

        @Override
        public int compare(Student s1, Student s2) {
            return comparator.compare(s1.getName(), s2.getName());
        }

    });*/
    }

}
