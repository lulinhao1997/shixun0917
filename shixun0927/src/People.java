public class People{
    private char szm;
    private String name;
    private int age;
    private char gender;
    private long phone;
    private String zuoji;



    public People(char szm, String name, int age, char gender, long phone) {
        this.szm = szm;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }

    public People(char szm, String name, int age, char gender, long phone, String zuoji) {
        this.szm = szm;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.zuoji = zuoji;
    }

    public char getSzm() {
        return szm;
    }

    public void setSzm(char szm) {
        this.szm = szm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getZuoji() {
        return zuoji;
    }

    public void setZuoji(String zuoji) {
        this.zuoji = zuoji;
    }

    @Override
    public String toString() {
        String hm=(phone+"").substring(0,3)+"****"+(phone+"").substring(6,10);
        return name+" "+age+"  "+hm;
    }
}