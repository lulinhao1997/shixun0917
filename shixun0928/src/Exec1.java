import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Exec1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张三","王五","张三","李四");
        HashSet<String> set=new HashSet<>() ;
        for (String s : list) {
            set.add(s);
        }
        System.out.println(set);
    }
}
