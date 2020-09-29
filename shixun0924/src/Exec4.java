public class Exec4 {
    public static void main(String[] args) {
        Teacher tea1=new Teacher("鹿林浩",23,'男');
        Teacher tea2=new Teacher("刘士嵩",21,'男');
        Teacher tea3=new Teacher("鹿林浩",23,'男');
        System.out.println(tea1.equals(tea3));
        System.out.println(tea1.equals(tea2));
    }
}
class Teacher{
    String name;
    int age;
    char gender;

    public Teacher(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        Teacher tea=(Teacher)obj;
        return name.equals(tea.name)&&age==(tea.age)&&gender==(tea.gender);
        //return super.equals(obj);
    }
}
