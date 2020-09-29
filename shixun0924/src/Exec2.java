public class Exec2 {
    public static void main(String[] args) {
        Ball0 ball01 = new Ball0(5);
        Ball0 ball02 = new Ball0(1);
        System.out.println(ball01);
        System.out.println(ball02);
    }
}
class Ball{
    int number;

    @Override
    public String toString() {
        return "Ball0{" +
                "number=" + number +
                '}';
    }

    public Ball(int number) {
        this.number = number;
    }
}
