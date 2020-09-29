import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
    static Scanner sca=new Scanner(System.in);
    public static String isABCD(String fenleiABCD){
        while (!(fenleiABCD.equals("A")||fenleiABCD.equals("B")||fenleiABCD.equals("C")||fenleiABCD.equals("D"))){

            fenleiABCD= sca.next();
        }
        return fenleiABCD;
    }
    public static String isSZM(String szm){
        while(!(szm!=null&&szm.length()==1||Character.isUpperCase(szm.charAt(0)))){
            szm=sca.next();
        }
        return szm;
    }
    public static String isName(String name){
        while( name.equals("习近平")||name.equals("江泽民")||name.equals("周恩来")){
            name=sca.next();
        }
        return name;
    }
    /**
     * 利用正则表达式判断字符串是否是数字
     * @param str
     * @return
     */
    public static boolean isNumber(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }
    public static String isAge(String agestr){
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(agestr);
        boolean b=true;
        if( !isNum.matches() ){
            b= false;
        }
        while(!b){
            agestr=sca.next();
        }
        return agestr;
    }
    public static String isab(String ab){
        while(!ab.equals("a")&&!ab.equals("b")){
            ab=sca.next();
        }
        return ab;
    }
    public static String isPhone(String phonestr){
        String three=phonestr.substring(0,3);
        while(!(isNumber(phonestr)&&phonestr!=null&&phonestr.length()==11&&(three.equals("138")||three.equals("130")||three.equals("137")||three.equals("158")||three.equals("155")||three.equals("188")))){
            phonestr=sca.next();
        }
        return phonestr;
    }
    public static boolean isZuoJi(String zuoji){
        return true;
    }

    public static boolean checkValidity (String str, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        if (m.matches()) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean checkPhone(String phonestr, ArrayList<People> list){
        if (phonestr==null){
            return false;
        }
        for (People people : list) {
            if (phonestr.equals(people.getPhone())){
                return false;
            }
        }
        return true;
    }
    //判断座机号格式是否正确
    public static String checkZuoJi(String zuoji){
        ArrayList<String> listzuoji=new ArrayList<>();
        Collections.addAll(listzuoji,"0564-","0531-","0532-","020-");
        while(!(zuoji.length()-zuoji.replace("-","").length()==1&&listzuoji.contains(zuoji.substring(0,zuoji.indexOf("-")+1)))){
            zuoji=sca.next();
        }
        return zuoji;
    }

    public static int checkNum(String x) {
        return Integer.parseInt(x);
    }
    public static String checkGeShi(String str){
        while (!(str.length()-str.replace("-","").length()==2)){
            System.out.println("请输入合法的格式:");
            str=sca.next();
        }
        return str;
    }
    public static boolean isHaving(long phone, ArrayList<People> list){
        for (People people : list) {
            if(people.getPhone()==phone){
                return true;
            }
        }
        return false;
    }

    public static String checkSzm(String szm) {
        while((szm.length()==1&&(szm.charAt(0)>='A'&&szm.charAt(0)<='Z'))){
            szm=sca.next();
        }
        return szm;
    }


}
