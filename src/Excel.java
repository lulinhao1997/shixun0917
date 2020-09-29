import org.omg.Messaging.SyncScopeHelper;

public class Excel {
    public static void main(String[] args) {
        User user=new User("鹿林浩","admin");
        user.show();
    }
}
class User{
    private String name;
    private String password;
    public User(String name,String password){
        this.name=name;
        this.password=password;
    }
    public void show(){
        System.out.println("亲爱的"+name+"用户 "+"您申请的密码是"+password);
    }
}
