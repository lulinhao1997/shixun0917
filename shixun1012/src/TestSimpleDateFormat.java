import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestSimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        String birthday="1997-06-27";
        SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
        long birth=f.parse(birthday).getTime();
        long now = System.currentTimeMillis();
        System.out.println((now-birth)/(24L*3600000));
    }
}
