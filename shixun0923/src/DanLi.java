public class DanLi {

}
class Moon{//饿汉式
    //private:私有化构造方法.防止外界随意创建对象
    private Moon(){}
    //private:保护她的值不被改变 mm=null
    //static:防止月亮里套月亮
    private static Moon mm=new Moon();

    public static Moon getMm(){
        return mm;
    }
}
class Sun{//懒汉式
    private Sun(){};
    private static Sun ss;
    public static synchronized Sun getSun(){
        if(ss==null){
            ss=new Sun();
        }
        return ss;
    }
}