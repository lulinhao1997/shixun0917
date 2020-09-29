import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Exec5 {
    public static void main(String[] args) {
        Teacher t1=new Teacher("周老师",28,5000.0);
        Teacher t2=new Teacher("王老师",30,5500.0);
        Teacher t3=new Teacher("周老师",30,5500.0);
        ArrayList<Teacher> list=new ArrayList<>();
        Collections.addAll(list,t1,t2,t3);
        Teacher t4=new Teacher("周老师",28,5500.0);
        list.remove(t4);
        System.out.println(list);
    }
}
class Teacher{
    private String name;
    private int age;
    private double salary;

    public Teacher(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        Teacher tea=(Teacher)obj;
        return tea.name.equals(name)&&tea.salary==salary;
    }
    @Override
    public String toString() {
        return name+"["+age+"]:"+salary;
    }
}
