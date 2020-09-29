public class Exec3 {
    public static void main(String[] args) {
        String str="etoak易途科技666";
        char[] chars = str.toCharArray();
        //byte[] bytes=(byte[]) chars;
        int counthz=0;
        int countzm=0;
        int countsz=0;
        for (char c:chars){
            if((c>=65&&c<=90)||(c>=97&&c<=122)){
                countzm++;
            }else if(c>='0'&&c<='9'){
                countsz++;
            }
        }
        counthz=str.length()-countzm-countsz;
        System.out.println("汉字个数:"+counthz);
        System.out.println("字母个数:"+countzm);
        System.out.println("数字个数:"+countsz);
    }
}
