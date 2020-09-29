import java.util.Random;

public class Exec1 {
    public static void main(String[] args) {
        //Random random=new Random();
        //int i=random.nextInt();
        int num=(int)(Math.random()*10000);
        String str=num+"";
        System.out.println(num+"是一个"+str.length()+"位数");
    }
}
