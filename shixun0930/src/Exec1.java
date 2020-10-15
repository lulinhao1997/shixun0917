import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Exec1 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("342423199808062065","汪美丽");
        map.put("754635465465475940","赵晓丽");
        map.put("64536536498392349x","张强强");
        map.put("xx","hhh");
        map.put("ss","ggg");
        Set<String> set=map.keySet();
        int count=0;
//        for (String id : set) {
//            //id.substring(16,17);
//            if(id.charAt(16)%2==0){
//                count++;
//            }
//        }
        System.out.println(count);
        System.out.println(map);
        Collection<String> values = map.values();
//        System.out.println(values);
//        for (String name : values) {
//            if(name.charAt(name.length()-2)==name.charAt(name.length()-1)){
//                System.out.println(name);
//            }
//        }
        //lambda表达式
        map.values().stream().filter(x->x.charAt(x.length()-2)==x.charAt(x.length()-1)).forEach(s -> System.out.println(s));
    }
}
