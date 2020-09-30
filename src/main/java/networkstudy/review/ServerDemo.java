package networkstudy.review;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package networkstudy.review
 * @description 回顾服务端多次接收消息
 * @date 2020-05-05 15:51:44
 */
public class ServerDemo {
    public static void main(String[] args) {
        DatagramSocket ds = null;

        try {
            // 定义一个通信对象
            ds = new DatagramSocket(9090);
            // 定义一个接收数据的数组
            byte[] bytes = new byte[1024];

            DatagramPacket dpServer = new DatagramPacket(bytes,bytes.length);
            System.out.println("服务端启动完成...");
            while (true){

                //准备接收客户端发送的数据
                ds.receive(dpServer);

                //获取客户端ip
                InetAddress clientAddr = dpServer.getAddress();

                //获取数据
                byte[] clientData = dpServer.getData();

                int length = dpServer.getLength();
                String strRe = new String(clientData,0,length);
                System.out.println(clientAddr.getHostAddress() + "发送的数据是:" + strRe);

                if (strRe.equals("exit")){
                    break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (ds != null){
                ds.close();
            }
        }
    }
}
