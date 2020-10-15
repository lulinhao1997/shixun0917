public class Student implements Comparable<Student>{
    String name;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public int compareTo(Student o) {
//        Student x=this;
//        Student y=o;
//
//        return x.age-y.age;
//    }

    @Override
    public int compareTo(Student o) {
        Student x=this;
        Student y=o;
        String n1 = x.name;
        String n2 = y.name;

        return n1.compareTo(n2);
    }
}