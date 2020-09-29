import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TongXunLu {
    static Scanner sca=new Scanner(System.in);
    static ArrayList<People> list=new ArrayList<>();
    public static void main(String[] args) {
        Friend x1 = new Friend('Z',"张三",22,'男',15555555555L,"0531-6661760");
        Friend x2 = new Friend('X',"小明",18,'男',18756789000L);
        Relatives x3 = new Relatives('W',"王刚美",28,'女',18322009876L);
        Colleague x4 = new Colleague('A',"阿磊",24,'男',15559501427L,"0564-6021117");
        Relatives x5 = new Relatives('Z',"周凯",38,'男',18765432189L);
        Friend x6 = new Friend('Z',"周树人",99,'男',17499990427L);
        Friend x7 = new Friend('Z',"张三",22,'男',15555445555L);
        Collections.addAll(list,x1,x2,x3,x4,x5,x6,x7);
        while (true) {
            System.out.println("A:显示所有联系人 \n" +
                    "B:查找某一位联系人 \n" +
                    "C:添加联系人\n" +
                    "D:删除联系人 \n" +
                    "E:修改联系人 \n" +
                    "F:结束当前所有操作\n");
            String choice = sca.next();
            if (choice.equals("A")) {
                chooseA();
            } else if (choice.equals("B")) {
                chooseB();
            } else if (choice.equals("C")) {
                while(!chooseC()){
                    continue;
                }
            } else if (choice.equals("D")) {
                chooseD();
            } else if (choice.equals("E")) {
                chooseE();
            } else {
                break;
            }
        }
    }
    public static void chooseA(){
        System.out.println("请选择:");
        System.out.println("a:按照首字母进行显示分类");
        System.out.println("b:按照类别进行分类显示：");
        while (true) {
            String ab = sca.next();
            if (ab.equals("a")) {
                showAlla();
                break;
            } else if (ab.equals("b")) {
                showAllb();
                break;
            } else {
                System.out.println("输入错误,请重新输入a或b");
                continue;
            }
        }
    }
    public static void chooseB(){
        System.out.println("请问你是通过联系人名字进行精确查找/手机号码模糊查询 ");
        System.out.println("[输入]");
        String str = sca.next();
        if (Check.isNumber(str)) {
            selectByNumber(str);
        } else {
            selectByName(str);
        }
    }
    public static boolean chooseC(){
        System.out.println("请选择联系人的分类A:亲人  B:同事  C:朋友  D:其他  ");
        String fenleiABCD = sca.next();
        fenleiABCD = Check.isABCD(fenleiABCD);
        System.out.println("请输入联系人名字大写首字母：");
        String szm = sca.next();
        szm = Check.isSZM(szm);
        System.out.println("请输入联系人的姓名：");
        String name = sca.next();
        name = Check.isName(name);
        System.out.println("请输入联系人的年龄：");
        String agestr = sca.next();
        agestr = Check.isAge(agestr);
        System.out.println("请选择联系人性别：a:男 b:女 ");
        String sexab = sca.next();
        sexab = Check.isab(sexab);
        System.out.println("请输入联系人的电话：");
        String phonestr = sca.next();
        phonestr = Check.isPhone(phonestr);
        System.out.println("请输入联系人座机号码（没有请回复N）：N/区号-座机号  000-475674");
        String zuoji = sca.next();
        zuoji=Check.checkZuoJi(zuoji);
        if (!Check.checkPhone(phonestr, list)) {
            System.out.println("对不起 当前用户已经存在 同一个用户不能添加多次");
            return false;
        }
        System.out.println("联系人分类:" + fenleiABCD);
        System.out.println("联系人名字大写首字母:" + szm);
        System.out.println("联系人姓名:" + name);
        System.out.println("联系人年龄:" + agestr);
        System.out.println("联系人性别:" + sexab);
        System.out.println("联系人电话:" + phonestr);
        System.out.println("联系人座机号码:" + zuoji);
        TongXunLuDAO dao = new TongXunLuDAO();
        list = dao.savePeople(list, fenleiABCD, szm, name, agestr, sexab, phonestr, zuoji);
        System.out.println("添加成功!");
        return true;
    }
    public static void chooseD(){
        showAll();
        System.out.println("请输入要被删除的学生的编码:");
        String x= sca.next();
        int id=Check.checkNum(x);
        if(0<=id&&id<list.size()){
            list.remove(id);
            System.out.println("删除成功!");
        }else{
            System.out.println("删除失败!");
        }
    }
    public static void chooseE(){
        System.out.println("请输入修改前的联系人姓名大写首字母 姓名 手机号码[中间用-间隔]" );
        String oldmessage=sca.next();
        oldmessage=Check.checkGeShi(oldmessage);
        //System.out.println("oldmessage:"+oldmessage);
        //String[] data = oldmessage.split("-");
        for (People people : list) {
            String str= people.getSzm()+"-"+people.getName()+"-"+people.getPhone();
            //System.out.println(str);
            if(str.equals(oldmessage)){
                System.out.println("请输入修改后联系人姓名大写首字母 姓名 电话号码");
                String newMessage= sca.next();
                newMessage=Check.checkGeShi(newMessage);
                String[] data=newMessage.split("-");
                char szm=data[0].charAt(0);
                String name=Check.checkSzm(data[1]);
                String phone0=Check.isPhone(data[2]);
                long phone=Long.parseLong(phone0);
                if(Check.isHaving(phone,list)){
                    System.out.println("修改失败,当前联系人已存在");
                }else{
                    people.setSzm(szm);
                    people.setName(name);
                    people.setPhone(phone);
                    System.out.println("修改成功!");
                    return;
                }
            }

        }
        System.out.println("修改失败,该用户不存在!");

    }
    public static void showAlla(){
        //存放首字母
        ArrayList<String> listszm=new ArrayList<>();
        //遍历list找到不重复的所有首字母
        for (People people : list) {
            char szm=people.getSzm();
            if(!listszm.contains(szm+"")){
                listszm.add(szm+"");
            }
        }
        //对首字母进行排序
        for (int i = 0; i < listszm.size()-1; i++) {
            for (int j=i+1;j<listszm.size();j++){
                if(listszm.get(i).charAt(0)>listszm.get(j).charAt(0)){
                    String si=listszm.get(i);
                    listszm.set(i,listszm.get(j));
                    listszm.set(j,si);
                }
            }
        }
        //按照首字母顺序打印所有的信息
        for (String s : listszm) {
            System.out.println(s);
            for (People people : list) {
                char szm = people.getSzm();
                if((szm+"").equals(s)){
                    System.out.println(people.getName()+"  "+people.getPhone());
                }
            }
        }
    }
    public static void showAllb(){
        //listclassname存放联系人分类
        ArrayList<String> listclassname=new ArrayList<>();
        //将所有不重复的联系人分类添加到listclassname里
        for (People people : list) {
            String classname= people.getClass().getName();
            if(!listclassname.contains(classname)){
                listclassname.add(classname);
            }
        }
        //按照联系人分类遍历list
        for (String s : listclassname) {
            System.out.println(s);
            for (People people : list) {
                if(people.getClass().getName().equals(s)){
                    System.out.println(people.getName()+"  "+people.getPhone());
                }
            }
        }
    }

    //按名字查找
    public static void selectByName(String name){
        System.out.println("[显示]");
        for (People people : list) {
            if(people.getName().equals(name)){
                showInformation(people);
            }
        }
    }
    //按照号码模糊查找
    public static void selectByNumber(String num){
        System.out.println("[显示]");
        for (People people : list) {
            String phonestr=people.getPhone()+"";
            if (phonestr.contains(num)){
                showInformation(people);
            }
        }
    }
    //展示查询信息
    public static void showInformation(People people){
        System.out.println("用户的基本信息:");
        System.out.println("联系人姓名:"+people.getName());
        System.out.println("联系人电话:"+people.getPhone());
        System.out.println("联系人座机号码:"+people.getZuoji());
        if(people.getZuoji()!=null){
            String quhao=people.getZuoji().substring(0,4);
            if (quhao.equals("0564")){
                System.out.println("座机显示城市:六安");
            }else if(quhao.equals("0531")){
                System.out.println("座机显示城市:济南");
            }else if(quhao.equals("0532")){
                System.out.println("座机显示城市:青岛");
            }
        }
    }
    //封装一个方法展示所有人
    public static void showAll(){
        System.out.println("编号  姓名  年龄  电话");
        for (int i = 0; i < list.size(); i++) {
            People p=list.get(i);
            String hm=p.getPhone()+"";
            System.out.println(i+"  "+p);
        }
    }

}

