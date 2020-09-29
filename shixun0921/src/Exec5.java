public class Exec5 {
    public static void main(String[] args) {
        String a="abc";
        String b="ABC";
        System.out.println(a.equalsIgnoreCase(b));;
        Student[] data=new Student[5];
        data[0]=new Student("张三",25,73);
        data[1]=new Student("赵丽丽",18,88);
        data[2]=new Student(null,18,49);
        data[3]=new Student("张三",18,50);
        data[4]=new Student("小雪",21,74);
        for (Student stu:data){
//            if("张三".equals(stu.name)&&stu.age==18){
//                System.out.println("18岁张三的成绩:"+stu.score);
//            }
            if(stu.name!=null&&stu.name.equals("张三")&&stu.age==18){
                System.out.println("18岁张三的成绩:"+stu.score);
            }
        }
    }
}
class Student{
    String name;
    int age;
    int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
