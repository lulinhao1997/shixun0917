public class Exec6 {
    public static void main(String[] args) {
        String str="张三:77 李四:82 王五:65";
        //打印张三的成绩
        String[] data = str.split(" ");
        for(String s:data){
            String[] data1 = s.split(":");
            if(data1[0].equals("张三")){
                System.out.println("张三的成绩:"+data1[1]);
            }

        }
    }
}
