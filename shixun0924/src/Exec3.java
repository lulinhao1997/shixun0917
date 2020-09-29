public class Exec3 {
    public static void main(String[] args) {
        Ball0 ball01 = new Ball0(5);
        Ball0 ball02 = new Ball0(8);
        System.out.println(ball01);
        System.out.println(ball02);

    }
}
class Ball0 {
    int number;
    char[] c=new char[]{'黄','蓝','灰','黑','紫','红','白','粉','绿'};

    public Ball0(int number){
        this.number=number;
    }

    @Override
    public String toString() {
        if(number>=1&&number<=9){
            return number+"号球"+c[number-1]+'色';
        }
        return "号码错误";
    }
}