import java.util.ArrayList;
import java.util.Collections;

public class Exec4 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5);
        System.out.println("list0:"+list);
        while(list.size()>=1){
            list.remove(0);
        }
       //list.clear();
        System.out.println("list1:"+list);
    }
}
