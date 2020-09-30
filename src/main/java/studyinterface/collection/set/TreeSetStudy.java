package studyinterface.collection.set;

/**
 * TreeSet特点:
 *  1.有序的[所有必须实现compareTo的方法]
 *  2.元素唯一的
 *  3.不允许有null
 *  4.非线程安全
 *
 * */
public class TreeSetStudy{
    public static void main(String[] args) {
        String str = "ac";
        String str1 = "aa";
        /**
         * 字符串的比较规则： 首先根据两个字符串的首字母进行对比,如果一个字符串的首字母
         * 比另一个字符串的首字母大,则这个字符串就大
         */
        int res = str.compareTo(str1);
        //res 正数 则str大,负数 则str1大,0 的话相等
        System.out.println(res);

        //比较两个对象的大小,先根据年龄,在比较名字
        Teacher th1 = new Teacher("edm",18);
        Teacher th2 = new Teacher("egm",18);
        int compare = th1.CompareTo(th2);
        System.out.println(compare);
    }
}
