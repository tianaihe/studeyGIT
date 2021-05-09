package paixu;

public class Student implements Comparable {
    public String name;
    public int age;
    public Student(){

    }
    public Student(String name,int age){
        this.age=age;
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
