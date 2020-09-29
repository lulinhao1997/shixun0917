public class Exec4 {

    public static void main(String[] args) {
        Student stu=new Student("杨童",22,'男');
        insert(stu);
        Teacher tea=new Teacher("周老师",30,'男');
        insert(tea);
    }
    public static void insert(Person person){
        StringBuffer sb=new StringBuffer();
        sb.append("insert into ");
        sb.append(person.getClass().getName());
        sb.append("(name,age,gender) values");
        sb.append("('"+person.getName()+"',"+person.getAge()+","+"'"+person.getGender()+"')");
        System.out.println(sb);
    }
}
class Person{
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
class Student extends Person{

    public Student(String name, int age, char gender) {
        super(name, age, gender);
    }
}
class Teacher extends Person{

    public Teacher(String name, int age, char gender) {
        super(name, age, gender);
    }
}