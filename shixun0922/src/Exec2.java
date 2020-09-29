public class Exec2 {
    public static void main(String[] args) {
        String str="3562875875210";
//        int[] count=new int[10];
//        char[] data = str.toCharArray();
//        for (int i=0;i<data.length;i++){
//            count[data[i]-48]++;
//        }
//        for (int i=0;i<count.length;i++){
//            System.out.println(i+"-》"+count[i]);
//        }
        //方法二
        for(int i=0;i<10;i++){
            String str1=str.replace(i+"","");
            System.out.println(i+"出现了"+(str.length()-str1.length()));
        }
    }
}
