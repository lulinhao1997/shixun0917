public class Exec2 {
    public static void main(String[] args) {
        String str="张三:77 李四:82 王五:51";
        String[] data = str.split(" ");
        String[] split1 = data[0].split(":");
        int max=Integer.parseInt(split1[1]);
        String maxname=split1[0];
        for (String data1:data){
            String[] s = data1.split(":");
            if(Integer.parseInt(s[1])>max){
                max=Integer.parseInt(s[1]);
                maxname=s[0];
            }
        }
        System.out.println(maxname+":"+max);
    }

}
