public class Person {
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        Teacher teacher =new Teacher("鹿林浩",23,5000);
        System.out.println(teacher);
    }
}
class Teacher extends Person{
    int salary;
    public Teacher(String name,int age,int salary){
        super(name,age);
        this.salary=salary;
    }
    public String toString(){
        return "name:"+name+" age:"+age+" salary:"+salary;
    }

}

