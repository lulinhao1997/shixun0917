public class Exec2 {
    public static void main(String[] args) {
        KongTiao kt=new KongTiao();
        ChaZuo cz=new ChaZuo();
        cz.TongDian(kt);
    }
}
interface Dianqi{
    int v = 220;
    String type = "电器";
    public void open();
    public void close();
}
class KongTiao implements Dianqi{

    @Override
    public void open() {
        System.out.println("打开空调");
    }

    @Override
    public void close() {
        System.out.println("关闭空调");
    }

}
class XiYiJi implements Dianqi{
    @Override
    public void open() {
        System.out.println("打开洗衣机");
    }

    @Override
    public void close() {
        System.out.println("关闭洗衣机");
    }
}
class ChaZuo{
    public void TongDian(Dianqi dq){
        dq.open();
        System.out.println("插座供应电");
        dq.close();
    }
}
