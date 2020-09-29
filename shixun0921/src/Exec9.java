public class Exec9 {
    public static void main(String[] args) {
        String[] data={"Cat","Dog","Animal","Bird"};
        //首字母升序排序
        for (int i=0;i<data.length-1;i++){
            for(int j=i+1;j<data.length;j++){
                if(data[j].charAt(0)<data[i].charAt(0)){
                    String temp=data[j];
                    data[j]=data[i];
                    data[i]=temp;
                }
            }
        }
        for (String name:data){
            System.out.println(name);
        }
    }
}
