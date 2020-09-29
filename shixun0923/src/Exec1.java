public class Exec1 {
    public static void main(String[] args) {
        Student student = Student.getStudent();
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
class Student{
    private String name;
    private int age;

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static Student getStu() {
        return stu;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void setStu(Student stu) {
        Student.stu = stu;
    }

    private static Student stu=new Student("鹿林浩",23);
    public static Student getStudent(){
        return stu;
    }
}
