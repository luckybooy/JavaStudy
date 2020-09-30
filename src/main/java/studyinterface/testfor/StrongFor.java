package studyinterface.testfor;


public class StrongFor {
    public static void main(String[] args) {
        String[] strs = {"詹姆斯","哈登","威少","利拉德"};
        /**
         * 增强for循环
         * 语法格式:
         *  for(数组/集合数据类型  变量:数组/集合){}
         *  缺点 不支持并发[就是在遍历的过程中不能操作数组或者集合]
         *  如果有并发需求,使用普通的for循环就行
         */
        for (String str : strs) {
            System.out.println(str);
        }
    }

}
