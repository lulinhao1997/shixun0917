import java.util.ArrayList;

public class TongXunLuDAO {
    public ArrayList<People> savePeople(ArrayList<People> list,String fenleiABCD,String szm,String name,String agestr,String sexab,String phonestr,String zuoji){
        People p=new People('Z',"张三",22,'男',15555555555L,"0531-6661760");;
        if (fenleiABCD.equals("A")){
            if(zuoji.equals("N")){
                p=new Relatives(szm.charAt(0),name,Integer.parseInt(agestr),sexab.charAt(0)=='a'?'男':'女',Long.parseLong(phonestr));
            }else{
                p=new Relatives(szm.charAt(0),name,Integer.parseInt(agestr),sexab.charAt(0)=='a'?'男':'女',Long.parseLong(phonestr),zuoji);
            }
        }else if (fenleiABCD.equals("B")){
            if(zuoji.equals("N")){
                p=new Colleague(szm.charAt(0),name,Integer.parseInt(agestr),sexab.charAt(0)=='a'?'男':'女',Long.parseLong(phonestr));
            }else{
                p=new Colleague(szm.charAt(0),name,Integer.parseInt(agestr),sexab.charAt(0)=='a'?'男':'女',Long.parseLong(phonestr),zuoji);
            }
        }else if (fenleiABCD.equals("C")){
            if(zuoji.equals("N")){
                p=new Friend(szm.charAt(0),name,Integer.parseInt(agestr),sexab.charAt(0)=='a'?'男':'女',Long.parseLong(phonestr));
            }else{
                p=new Friend(szm.charAt(0),name,Integer.parseInt(agestr),sexab.charAt(0)=='a'?'男':'女',Long.parseLong(phonestr),zuoji);
            }
        }else if (fenleiABCD.equals("D")){
            if(zuoji.equals("N")){
                p=new Other(szm.charAt(0),name,Integer.parseInt(agestr),sexab.charAt(0)=='a'?'男':'女',Long.parseLong(phonestr));
            }else{
                p=new Other(szm.charAt(0),name,Integer.parseInt(agestr),sexab.charAt(0)=='a'?'男':'女',Long.parseLong(phonestr),zuoji);
            }
        }
        list.add(p);
        return list;
    }
}
