package exercises.string;

public class TestStringDemo1 {

    /**
     * 找出字符串中"ai"的个数
     * @param args
     */
    public static void main(String[] args) {
        //定义一个计数器
        int count= 0;
        String str = "aibbjaiabjbdfjadoaifajbaitewhieeaiqentkqwntqieqejrqweiai";
        //找到第一个"ai"所处位置的索引
        int index = str.indexOf("ai");
        //如果index = -1的话就代表后边找不到这个"ai"字符串了
        while (index != -1){
            count ++;
            //查找下一次出现目标字符串的索引,并将索引更新至一下次出现索引的位置
            index = str.indexOf("ai", index + 2);
        }
        System.out.println("字符串中包含'ai'的数量是:" + count);
    }
}
