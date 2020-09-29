import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Exec7 {
    public static void main(String[] args) {
        Food f1 = new Food("猪耳朵拌黄瓜",25,"凉菜");
        Food f2 = new Food("爆炒土豆丝",18,"热菜");
        Food f3 = new Food("凉拌金针菇",18,"凉菜");
        Food f4 = new Food("凉拌木耳",18,"凉菜");
        Food f5 = new Food("小鸡炖蘑菇",45,"热菜");
        ArrayList<Food> list=new ArrayList<>();
        Collections.addAll(list,f1,f2,f3,f4,f5);
        int b=0;
        for(Iterator<Food> car=list.iterator();car.hasNext();){
            if(car.next().type.equals("凉菜")){
                b++;
                if(b==3){
                    car.remove();

                }
            }
        }
        System.out.println(list);
    }
}
class Food{
    String name;
    double price;
    String type;

    public Food(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return name+"["+price+"]:"+type;
    }
}
