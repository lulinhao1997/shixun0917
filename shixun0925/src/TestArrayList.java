import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        int x=45;
        Integer integer = x;
        List list=new ArrayList();
        list.add(integer);
        for (Object o : list) {
            System.out.println(o);
        }
        Integer i1=100;
        Integer i2=100;
        System.out.println(i1==i2);
    }
}
