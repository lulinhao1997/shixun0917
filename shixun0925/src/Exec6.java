import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Exec6 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"刘德华","黎明","张学友");
        //删除所有三个字的名字
        for (Iterator<String> car = list.iterator();car.hasNext();){
            if(car.next().length()==3){
                car.remove();
            }
        }
        System.out.println(list);

    }
}
