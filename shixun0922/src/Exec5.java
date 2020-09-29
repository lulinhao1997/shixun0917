public class Exec5 {
    public static void main(String[] args) {
        String str="12345678";
        StringBuffer sb=new StringBuffer(str);
        int index=sb.length()%3;
        for (int i=index==0?3:index;i<sb.length();i+=4){
            if(i==0){
                i=3;
            }
            sb.insert(i,",");
        }
        System.out.println(sb);

    }
}
