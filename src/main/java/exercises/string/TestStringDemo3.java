package exercises.string;


public class TestStringDemo3 {
    public static void main(String[] args) {
        System.out.println(new String("abc").equals(new String("abc")));
        System.out.println(new StringBuffer("abc").equals(new StringBuffer("abc")));
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = sb.append("abc");
        System.out.println(sb == sb2);
    }
}
