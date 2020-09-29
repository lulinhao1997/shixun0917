import java.util.ArrayList;
import java.util.Collections;

public class Exec3 {
    public static void main(String[] args) {
        //创建一个ArrayList
        ArrayList<String> list=new ArrayList<>();
        //一次添加一个元素分别添加:Andy Lee
        list.add("Andy");
        list.add("Lee");
        //一次添加多个元素直接添加:Anron Jack
        Collections.addAll(list,"Anron","Jack");
        //统计几个人的姓名
        System.out.println(list.size());
        //得到第二个名字
        String name = list.get(1);
        //判断集合里面是否包含Lee
        System.out.println(list.contains("Lee"));
        //使用两种遍历方式,打印所有以A开头的名字
        for (String s : list) {
            if(s.startsWith("A")){
                System.out.println(s);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).startsWith("A")){
                System.out.println(list.get(i));
            }
        }
    }
}
