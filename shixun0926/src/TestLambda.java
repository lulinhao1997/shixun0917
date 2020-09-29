import java.util.ArrayList;
import java.util.Collections;

public class TestLambda {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,55,88,56,65,95);
        list.forEach(System.out::println);
        list.forEach(x-> System.out.println(x+"分"));
    }
}
