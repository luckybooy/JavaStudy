package thread.learntwo;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package thread.learnone.learntwo
 * @description
 * @date 2020-05-02 20:33:36
 */
public class TestDemo {
    /**
     * 线程的执行原理:
     *      线程的并发执行通过多个线程不断的切换CPU的资源,这个速度非常快,我们感知不到,
     *      我们所能感知到的就是三个线程的并发执行.
     * 线程的生命周期
     *      1.新建:线程被new出来
     *      2.准备就绪:线程具有执行的资格,即线程调用了start()方法,没有获得执行的权利(可以理解为:没有获得cpu的资源)
     *      3.运行:获得执行的权限,并开始执行
     *      4.阻塞:没有获得执行的权利(sleep() ,wait(),notify() )
     *      5.销毁:线程对象变成垃圾,释放资源
     */
}
