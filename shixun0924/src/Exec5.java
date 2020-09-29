public class Exec5 {
    public static void main(String[] args) {
        Computer c1=new Computer("华硕",14,3000,'白',true);
        System.out.println(c1);
        Computer c2=new Computer("华硕",14,3000,'白',true);
        System.out.println(c1.equals(c2));
        System.out.println(c1.toString().hashCode());
        System.out.println(c2.toString().hashCode());
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}
class Computer{
    private String name;
    private double size;
    private int price;
    private char color;
    private boolean isShangShi;

    public Computer(String name, double size, int price, char color, boolean isShangShi) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.color = color;
        this.isShangShi = isShangShi;
    }
    @Override
    public String toString(){
        return name+"牌子的电脑新出来一款"+color+"颜色 尺寸是"+size+" 售价"+price+(isShangShi?"已经上市":"至今还没上市");
    }
    @Override
    public boolean equals(Object o){
        Computer c=(Computer)o;
        return name.equals(c.name)&&size==c.size&&price==c.price&&color==c.color&&isShangShi==c.isShangShi;
    }
}
