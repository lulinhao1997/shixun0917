import java.util.Collections;
import java.util.TreeSet;

public class TestComparale {
    public static void main(String[] args) {
        Student s1=new Student("张三",25);
        Student s2=new Student("李四",21);
        TreeSet<Student> set=new TreeSet<>();
        Collections.addAll(set,s1,s2);
        System.out.println(set);
    }
}
