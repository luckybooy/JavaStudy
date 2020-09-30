package networkstudy;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package networkstudy
 * @description 服务端
 * @date 2020-05-05 11:49:30
 */
public class ChatServer {
    public static void main(String[] args) {
        /**
         * DatagramSocket类表示用来发送和接收数据报包的套接字
         * 创建一个 接受数据的对象
         */
        DatagramSocket ds = null;

        try {
            ds = new DatagramSocket(10000);
            //创建一个字节数组
            byte[] bytes = new byte[1024];
            /*  字符串是长度[length()]方法,数组是长度属性
            String str = "helloworld";
            int length = str.length();
            System.out.println("字符串是length()方法,其长度为:" + length);*/
            //创建数据包
            DatagramPacket dp = new DatagramPacket(bytes,0,bytes.length);
            System.out.println("server端已启动~~~");

            //准备接受客户端发送的数据
            ds.receive(dp);
            //获得客户端ip
            InetAddress clientAddress = dp.getAddress();
            //获得数据
            byte[] data = dp.getData();
            //获取接收数据的长度
            int length = dp.getLength();
            //创建接收的字符串
            String strReceive = new String(data,0,length);
            System.out.println("接收到的数据是:" + strReceive);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (ds != null){
                ds.close();
            }
        }
    }
}
