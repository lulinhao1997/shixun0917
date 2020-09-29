import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        SortedSet<String> set=new TreeSet<>();
        Collections.addAll(set,"B","E","C");
        System.out.println(set);
    }
}
