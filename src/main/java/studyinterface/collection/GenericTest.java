package studyinterface.collection;

public class GenericTest {
    public static void main(String[] args) {
        //实际使用泛型实例
        CustomGeneric<String> customGeneric = new CustomGeneric<>();
        customGeneric.setT("helloworld");
        String t1 = customGeneric.getT();
        System.out.println(t1);

        CustomGeneric<Integer> cuInt = new CustomGeneric<>();
        cuInt.setT(23);
        Integer t = cuInt.getT();
        System.out.println(t);
    }
}
