import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        Collections.addAll(list,32,43,53);
        System.out.println(list);
        System.out.println(list.contains(43));
    }
}
