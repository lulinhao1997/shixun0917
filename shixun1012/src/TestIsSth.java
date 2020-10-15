import java.io.File;

public class TestIsSth {
    public static void main(String[] args) {
        File f=new File("a.txt");
        System.out.println(f.exists());
        System.out.println(f.length());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
    }
}
