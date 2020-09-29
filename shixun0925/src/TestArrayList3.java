import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,666,777,888);
        list.remove(new Integer(666));
        list.remove(0);
        System.out.println(list);
        list.contains(777);
    }
}
