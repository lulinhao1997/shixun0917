public class Exec6 {
    public static void main(String[] args) {
        System.out.println(check("abccba"));
        System.out.println(check("etoakaote"));
        System.out.println(check("hellohi"));
    }
    public static boolean check(String str){
        //方法一
        //        char[] data = str.toCharArray();
//        for (int i=0;i<data.length/2;i++){
//            if (data[i]!=data[data.length-i-1]){
//                return false;
//            }
//
//        }
//        return true;
        //方法二
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        if ((sb+"").equals(str)){
            return true;
        }
        return false;
    }
}
