public class Runnable01  implements Runnable{
    @Override
    public void run() {
        for (char i = 'a'; i <='z' ; i++) {
            System.out.println(i);
        }
    }
}
