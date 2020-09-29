import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestArrayList1Plus {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,56,77,21,88,90);

        int sum=0;
        for(Iterator<Integer> car=list.iterator();car.hasNext();){
            Integer x = car.next();
            //System.out.println(x);
            sum+=x;
        }
        System.out.println(sum);
        int avg=sum/list.size();
        for(Iterator<Integer> car=list.iterator();car.hasNext();){
            Integer score = car.next();
            if(score>avg){
                System.out.println(score);
            }
        }
    }
}
