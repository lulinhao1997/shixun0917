public class Exec4 {
    public static void main(String[] args) {
        String str="刘德华,黎明,郭富城,张学友";
        String[] strings = str.split(",");
        for (String s: strings){
            if(s.length()==3){
                System.out.println(s);
            }
        }
    }
}
