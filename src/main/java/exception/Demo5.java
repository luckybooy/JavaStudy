package exception;



public class Demo5 {
    /**
     * 接收方法体抛上来的异常
     * @param args
     * @throws DemoVaildException
     */
    public static void main(String[] args) throws DemoVaildException {
        Person p = new Person("萧然",204);
        System.out.println(p);
    }
}
