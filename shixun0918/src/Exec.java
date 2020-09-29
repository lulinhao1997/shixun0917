import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Exec {
    static Student[] data=new Student[5];

    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        data[0]=new Student("赵晓雪",21,'女',77);
        data[1]=new Student("王刚美",23,'男',61);
        data[2]=new Student("周小刚",22,'女',93);
        data[3]=new Student("张强",21,'男',52);
        data[4]=new Student("张帅",22,'男',85);
        while (true){
            System.out.println("请选择要操作的选项");
            System.out.println("A:按照分数升序排列");
            System.out.println("B:按照分数降序排列");
            System.out.println("C:添加学生信息");
            System.out.println("D:删除学生信息");
            System.out.println("E:修改学生信息");
            System.out.println("F:退出");
            //Scanner scanner=new Scanner(System.in);
            String ss = scanner.next();
            if(ss.equals("A")){
                chooseA();
                print();
            }else if(ss.equals("B")){
                chooseB();
                print();
            }else if(ss.equals("C")){
                chooseC();
            }else if(ss.equals("D")){
                chooseD();
            }else if(ss.equals("E")){
                chooseE();
            }
            else if(ss.equals("F")){
                return;
            }
        }
    }
    public static void chooseA(){
        for(int x=0;x<data.length-1;x++){
            for (int y=x+1;y<data.length;y++){
                if(data[x].getScore()>data[y].getScore()){
                    Student student=new Student();
                    student=data[x];
                    data[x]=data[y];
                    data[y]=student;
                }
            }
        }
    }
    public static void chooseB(){
        for(int x=0;x<data.length-1;x++){
            for (int y=x+1;y<data.length;y++){
                if(data[x].getScore()<data[y].getScore()){
                    Student student=new Student();
                    student=data[x];
                    data[x]=data[y];
                    data[y]=student;
                }
            }
        }
    }
    public static void chooseC(){
        //Scanner scanner=new Scanner(System.in);
        System.out.println("请输入学生的姓名:");
        String name=scanner.next();
        System.out.println("请输入学生的年龄:");
        int age= scanner.nextInt();
        System.out.println("请输入学生的性别:");
        String AB = scanner.next();
        char gender;
        if(AB.equals("A")){
            gender='男';
        }else{
            gender='女';
        }
        System.out.println("请输入学生的分数:");
        int score = scanner.nextInt();
        Student student=new Student(name,age,gender,score);
        if(isHaving(student)){
            System.out.println("学生信息已存在,添加失败!");
        }else {
            data = Arrays.copyOf(data, data.length + 1);
            data[data.length-1]=student;
            System.out.println("添加成功!");
            print();
        }
    }
    public static void chooseD(){
        print();
        System.out.println("请输入你要删除学生的编码:");
        int index = scanner.nextInt();
        if(index<0||index>data.length-1){
            System.out.println("编码不存在!");
        }else{
            for(int i=0;i<data.length-1;i++){
                if(i<index){
                    continue;
                }else{
                    data[i]=data[i+1];
                }
            }
                data=Arrays.copyOf(data,data.length-1);
            print();
        }
    }
    public static void chooseE(){
        print();
        System.out.println("请输入要修改的学生的编码:");
        int index = scanner.nextInt();
        if(index<0||index>data.length-1){
            System.out.println("编码不存在!");
        }else{
            System.out.println("修改前学生的姓名:"+data[index].getName()+"  请输入修改后的学生的姓名:");
            String name = scanner.next();
            System.out.println("修改前的学生的年龄:"+data[index].getAge()+"  请输入修改后的学生的年龄:");
            int age = scanner.nextInt();
            System.out.println("修改前的学生的分数:"+data[index].getScore()+"    请输入修改后的学生的分数:");
            int score = scanner.nextInt();
            System.out.println("修改前学生的性别:"+data[index].getGender()+"    请输入修改后的学生的性别[A:男 B:女]");
            String AB = scanner.next();
            char  gender;
            if(AB.equals("A")){
                gender='男';
            }else{
                gender='女';
            }
            Student student=new Student(name,age,gender,score);
            if(isHaving(student)){
                System.out.println("修改失败,该学生已存在!");
            }else{
                data[index]=student;
                print();
            }

        }

    }
    public static boolean isHaving(Student student){
        for(int i=0;i<data.length;i++){
            if(data[i].getName().equals(student.getName())&&data[i].getAge()==student.getAge()&&data[i].getGender()==student.getGender()&&data[i].getScore()==student.getScore()){
                return true;
            }
        }
        return false;
    }
    public static void print(){

        System.out.println("编码  姓名  年龄  性别  分数");
        for(int x=0;x<data.length;x++){

            System.out.println(x+"  "+data[x].getName()+"   "+data[x].getAge()+" "+data[x].getGender()+"    "+data[x].getScore());

        }
    }


}
class Student{
    private String name;
    private int age;
    private char gender;
    private int score;

    public Student() {

    }

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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student( String name, int age, char gender, int score) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.score = score;
    }
}