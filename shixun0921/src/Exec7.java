public class Exec7 {
    public static void main(String[] args) {
        String str="文一章,张默,房祖名一,柯震东西,罗志祥,李代沫沫,李健";

        String[] data = str.split(",");
        System.out.println("渣男的个数:"+data.length);
        System.out.println("名字里包含一:");
        for(String name :data){

            if(name.contains("一")){
                System.out.println("----"+ name);
            }
        }

        int count=0;
        for (String name :data){
            if(name.startsWith("李")){
                count++;
            }
        }
        System.out.println("姓李的人的个数:"+count);
        System.out.println("像鬼子的人名:");
        for (String name:data){
            if(name.length()>=4){
                System.out.println("----"+ name);
            }
        }
    }
}
