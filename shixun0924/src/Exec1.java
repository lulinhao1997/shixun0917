public class Exec1 {

    public static void main(String[] args) throws Exception{
        OS os1=new OS("Windows");
        OS os2=os1.clone();
        System.out.println(os1.name);
        System.out.println(os2.name);
        System.out.println(os1==os2);
    }
}
class OS extends Object implements Cloneable{
    String name;
    public OS(String name){
        this.name=name;
    }

    @Override
    public OS clone() throws CloneNotSupportedException {
        return (OS)super.clone();
    }

}
    