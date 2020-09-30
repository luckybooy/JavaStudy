package networkstudy;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package networkstudy
 * @description 网络知识获取主机名和ip
 * @date 2020-05-05 11:26:07
 */
public class StduyInternet {
    public static void main(String[] args) throws UnknownHostException {
        //获取本地主机对象
        InetAddress localHost = InetAddress.getLocalHost();
        //返回此 InetAddress 对象的原始 IP 地址
        byte[] address = localHost.getAddress();
        System.out.println(Arrays.toString(address));

        //获取本机ip
        String hostAddress = localHost.getHostAddress();
        System.out.println("本地ip:" + hostAddress);

        //获取本地的主机名
        String hostName = localHost.getHostName();
        System.out.println("主机名:" + hostName);

        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,0,bytes.length);
        InetAddress clientAddress = dp.getAddress();
        System.out.println(clientAddress);
    }
}
