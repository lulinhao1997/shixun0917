public class Main1 {
    public static void main(String[] args) {
        Thread01 thread01=new Thread01();
        thread01.start();
        Runnable01 runnable01=new Runnable01();
        Thread thread=new Thread(runnable01);
        thread.start();
    }
}
