public class Exec3 {
    public static void main(String[] args) {
        String str="helloworld";
        char[] data = str.toCharArray();
        //字符串去重
        for(int i=0;i<data.length-1;i++){
            for(int j=i+1;j<data.length;j++){
                if(data[j]==data[i]){
                    data[j]=' ';
                }
            }
        }
        for (char c : data) {
            if (c!=' '){
                System.out.print(c);
            }

        }
    }
}
