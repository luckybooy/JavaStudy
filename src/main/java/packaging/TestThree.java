package packaging;

/**
 * 装箱:把int类型转换为Integer---->new Integer(int i)
 * 拆箱:把Integer 转换为int---->intValue()对象方法
 * 拆箱和装箱不需要我们主动调用,jvm自动会帮我们完成
 * 其他的七种基本数据和Integer是一样的
 */
public class TestThree {
    public static void main(String[] args) {
        int i = 10;
        //自动装箱
        Integer integer = i;
        System.out.println("装箱:" + integer);
        //自动拆箱
        Integer integer1 = new Integer(23);
        int i1 = integer1;
        System.out.println("拆箱：" + i1);

        /**
         * 自动装箱底层原理：
         *     实际上自动装箱也是创建的Integer对象,只不过是由Integer类自动完成的,
         *     -128到127之间使用的是缓存对象,所以做对比时是相等的,超出这个范围都
         *     是new Integer()
         **/

        Integer integer2 = 127;
        Integer integer3 = 127;
        System.out.println(integer2==integer3); //true

        Integer integer4 = 128;
        Integer integer5 = 128;
        System.out.println(integer4==integer5);  //false
    }
}
