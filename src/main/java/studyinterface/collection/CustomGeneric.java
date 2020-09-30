package studyinterface.collection;

/**
 * 自定义泛型
 * 语法格式:
 *  class/interface + 类名/接口名<T>{}   <>中填写其他字符也可以,但通常填写T就可以了
 * @param <T>
 */
public class CustomGeneric<T> {
    //定义一个泛型
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
