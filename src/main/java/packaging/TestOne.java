package packaging;

public class TestOne {
    public static void main(String[] args) {
        int i;
        Integer integer = 10;
        Integer intg ;
        /**
         * 整形包装类的最大和最小值
         */
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        System.out.println("最大值:" + maxValue);
        System.out.println("最大值:" + minValue);

        /**
         * 比较两个数的大小,前边的大返回1,后边的大返回-1，相等则返回0
         */
        int i1 = integer.compareTo(10);
        System.out.println(i1);

        //获取两者中的较大值
        int max = Integer.max(14, 6);
        System.out.println(max);
    }
}
