import java.util.Scanner;

public class Exec3 {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("请输入老师的姓名:");
        String name=sca.next();
        System.out.println("请输入老师的年龄:");
        int age=sca.nextInt();
        System.out.println("请输入老师的工资:");
        double salary=sca.nextDouble();
        System.out.println("请选择老师的性别:[A:男 B:女]");
        String sex=sca.next();
        Teacher1 teacher1 =new Teacher1(name,age,salary,sex);
        System.out.println("姓名:"+name);
        System.out.println("年龄:"+age);
        System.out.println("工资:"+salary);
        if(sex.equals("A")){
            System.out.println("性别:男");
        }else if(sex.equals("B")){
            System.out.println("性别:女");
        }else{
            System.out.println("性别输入格式不正确");
        }

    }
}
class Teacher1 {
    String name;
    int age;
    double salary;
    String sex;

    public Teacher1(String name, int age, double salary, String sex) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.sex = sex;
    }
}
