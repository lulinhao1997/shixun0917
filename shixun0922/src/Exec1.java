public class Exec1 {
    public static void main(String[] args) {
        String str="吃葡萄不吐葡萄皮,不吃葡萄倒吐葡萄皮";
        //葡萄出现的次数>=4
        //方法一 将两个字的葡萄替换成一个字,看新老字符串的长度差
//        String str1=str.replaceAll("葡萄"," ");
//        int len=(str.length()-str1.length());
//        System.out.println(len);
        //方法二 将字符串打碎得到每一个字,看看葡萄出现的次数
//        char[] data = str.toCharArray();
//        int count=0;
//        for (int i=0;i<data.length-1;i++){
//            if(data[i]=='葡'&&data[i+1]=='萄'){
//                count++;
//            }
//        }
//        System.out.println(count);
        //方法三 按照葡萄劈开,看看还剩多少段
//        str+="a";
//        String[] s = str.split("葡萄");
//        int len=s.length-1;
//        System.out.println(len);
        //方法四 不断替换第一个葡萄,看看替换了多少次
//        int count=0;
//        while (str.contains("葡萄")){
//            str=str.replaceFirst("葡萄","");
//            count++;
//        }
//        System.out.println(count);
        //方法五
        int count=0;
        int index;
        while((index=str.indexOf("葡萄"))!=-1){
            str=str.substring(index+2);
            count++;
        }
        System.out.println(count);

    }
}
