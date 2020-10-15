import java.util.Collections;
import java.util.TreeSet;
public class Exec4 {
    public static void main(String[] args) {
        TreeSet<Food> set=new TreeSet<>();
        Food f1=new Food("猪耳朵拌黄瓜",23,2);
        Food f2=new Food("小鸡炖蘑菇",45,1);
        Food f3=new Food("82年的茅台",18000,0);
        Food f4=new Food("西红柿鸡蛋汤",25,3);
        Food f5=new Food("炒饼",7,4);
        Food f6=new Food("辣椒炒肉",23,1);
        Collections.addAll(set,f1,f2,f3,f4,f5,f6);
        System.out.println(set);
    }
}
class Food implements Comparable<Food>{
    String name;
    int price;
    int type;

    public Food(String name, int price, int type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
//

        String[] data={"酒水","热菜","凉菜","汤","主食"};
        return name+":"+data[type];
        //return name+":"+typestr;
    }

    @Override
    public int compareTo(Food food) {
        int p=food.price-this.price;
        if (p!=0){
            return p;
        }else{
            int t=this.type-food.type;
            if(t!=0){
                return t;
            }
        }
        return 0;
    }
}
