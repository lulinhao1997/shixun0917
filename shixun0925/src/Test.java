public class Test {
    public static void main(String[] args) {
        People p1=new People("A");
        People p2=new People("A");
        p1.equals(p2);
    }
}
class People{
    String name;

    public People(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        People p2 = (People) obj;
        return this.name.equals(p2.name);
    }
}
