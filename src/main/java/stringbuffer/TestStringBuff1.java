package stringbuffer;

public class TestStringBuff1 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        //默认构造器的容量是16,超过的会自动扩容
        System.out.println(sb.capacity());
        sb.append("0123456789helloWord");
        System.out.println(sb.capacity());
        /**
         * 可变字符串追加后还是这个字符串的引用,所以可以采用链式追加
         */
        CommonDemo cd = new CommonDemo("linping",23,12);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(123)
                .append('A')
                .append(2.3f)
                .append(2.4)
                .append(cd);
        //System.out.println(stringBuffer);

        StringBuffer sb2 = new StringBuffer("helloword");
        //在哪个位置索引插入什么内容
        //比如在索引0的位置插入字符A  凡是涉及索引一定要考虑越界的问题
        sb2.insert(0,'A');
        System.out.println(sb2);   //Ahelloword
        //删除指定索引位置的字符
        sb2.deleteCharAt(1);
        System.out.println(sb2);        //Aelloword
        //删除索引区间的字符包头去尾[2,4)
        sb2.delete(2,4);
        System.out.println(sb2);        //Aeoword
        //将索引区间的字符替换为...包头去尾
        sb2.replace(1,3,"xiaoran");
        System.out.println(sb2);        //Axiaoranword
        //反转过来
        sb2.reverse();
        System.out.println(sb2);         //drownaroaixA
    }
}
