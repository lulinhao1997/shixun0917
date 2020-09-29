import java.util.ArrayList;
import java.util.Collections;

public class TestLambda2 {
    public static void main(String[] args) {
        Student s1=new Student("Tom",22);
        Student s2=new Student("张三",23);
        ArrayList<Student> list=new ArrayList<>();
        Collections.addAll(list,s1,s2);
    }
}
class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
