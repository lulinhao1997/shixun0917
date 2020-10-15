import java.util.Collections;
import java.util.TreeSet;

public class Exec2 {
    public static void main(String[] args) {
        TreeSet<Ball> set=new TreeSet<>();
        Ball b1=new Ball(5,'蓝');
        Ball b2=new Ball(1,'紫');
        Ball b3=new Ball(8,'红');
        Collections.addAll(set,b1,b2,b3);
        System.out.println(set);
    }
}
class Ball implements Comparable<Ball>{
    int number;
    char color;

    @Override
    public String toString() {
        return "Ball{" +
                "number=" + number +
                ", color=" + color +
                '}';
    }

    public Ball(int number, char color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public int compareTo(Ball b) {

        return this.number-b.number;
    }
}