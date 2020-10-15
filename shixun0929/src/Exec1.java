import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Exec1 {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        Collections.addAll(set,55,80,13,41,72);
        System.out.println(set);
        //降序打印
//        while (set.size()>0){
//            System.out.println(set.pollLast());
//
//        }
        ArrayList<Integer> list=new ArrayList<>(set);
        System.out.println(list);
        list.forEach(integer -> System.out.println(integer));
        for (Integer integer : list) {
            System.out.println(integer);
        }
        for (int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }

    }
}

