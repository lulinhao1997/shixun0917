import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        test(5,2,6,8);
        ArrayList<Integer> list=new ArrayList<>();
        addAll(list,6,2,8,4);
        System.out.println(list);
    }


    public static void test(int x,int y,int ...nums){
        for (int num : nums) {
            System.out.println(num);
        }
    }
    public static void addAll(ArrayList<Integer> jihe,Integer...data){
        for (Integer num : data) {
            jihe.add(num);
        }
    }
}
