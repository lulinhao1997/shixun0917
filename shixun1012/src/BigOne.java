import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class BigOne {
    public static void main(String[] args) {
        List<Hotel> list=new ArrayList<>();
        list.add(new Hotel("香格里拉",1688,2188));
        list.add(new Hotel("喜来登",1288,2500));
        list.add(new Hotel("希尔顿",1866,1866));
        list.add(new Hotel("七天",150,180));
        String birthday="1987-09-18";
        SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
        long birth = 0;
        try {
            birth = f.parse(birthday).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long now=System.currentTimeMillis();
        int sum=0;
        Calendar cal = Calendar.getInstance();
        for (long x=birth;x<now;x+=24*3600000){
            cal.setTimeInMillis(x);
            int day=cal.get(7);
            if(day==1||day==7){

            }

        }


    }
}
class Hotel{
    String name;
    int normal;
    int weekend;

    public Hotel(String name, int normal, int weekend) {
        this.name = name;
        this.normal = normal;
        this.weekend = weekend;
    }
}