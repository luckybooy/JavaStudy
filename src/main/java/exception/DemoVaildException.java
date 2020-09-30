package exception;

/**
 * 自定义一个编译时异常的类,继承Exception,需要将Exception的方法给实现下
 */
public class DemoVaildException extends Exception{
    public DemoVaildException() {
        super();
    }

    public DemoVaildException(String message) {
        super(message);
    }

    public DemoVaildException(String message, Throwable cause) {
        super(message, cause);
    }

    public DemoVaildException(Throwable cause) {
        super(cause);
    }

    protected DemoVaildException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
