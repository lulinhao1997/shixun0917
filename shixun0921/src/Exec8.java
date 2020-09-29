public class Exec8 {
    public static void main(String[] args) {
//        String str="EtOaK";
//        String s = str.toUpperCase();
//        System.out.println(s);
//        String str1="吃葡萄不吐葡萄皮";
//        String replace = str1.replace("葡萄", "核桃");
//        System.out.println(replace);
//        String a="47t2awu6";
//        String zimu = a.replaceAll("[0-9]", "");
//        String shuzi=a.replaceAll("[a-z]","");
//
//        System.out.println(zimu);
//        System.out.println(shuzi);
        System.out.println(check("123木头人"));
        System.out.println(check("etoak"));
        System.out.println(check("7289"));

    }
    public static boolean check(String str){
        char[] data = str.toCharArray();
        //boolean b=true;
        for (char name:data){
            if(name<'0'||name>'9'){
                return false;
            }
        }
        return true;
    }
    public static boolean check2(String str){
       return str.replaceAll("[0-9]","").length()==0;
    }
}
