public class Exec2<b> {
    public static void main(String[] args) {
        String str="etoak易途科技";
        int len=str.length();
        byte[] bytes=str.getBytes();
//        int count=0;
//        for(char c:bytes){
//            if(c<0){
//                count++;
//            }
//        }
//        System.out.println(count+"个汉字");
        for (int c:bytes){
            System.out.println(c);
        }


        System.out.println("bytes长度:"+bytes.length);
        System.out.println(bytes.length-len+"个汉字");
    }
}
