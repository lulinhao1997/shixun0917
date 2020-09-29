import java.util.ArrayList;
import java.util.List;

public class Exec1 {
   public static void main(String[] args) {
        String str="张三:18";
        //三年后张三的年龄
        //Integer parseInt
        String[] split = str.split(":");
        String agestr=split[1];
        str.substring(str.indexOf(":")+1);
        int age0 = Integer.parseInt(agestr);
        int age=age0+3;
        //Integer agei=age;
        System.out.println(age);


    }
}
