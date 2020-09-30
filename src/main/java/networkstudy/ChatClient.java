package networkstudy;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package networkstudy
 * @description 客户端
 * @date 2020-05-05 12:06:35
 */
public class ChatClient {
    public static void main(String[] args) {
        DatagramSocket dsClient = null;

        try {
            dsClient = new DatagramSocket();
            String str = "这是客户端发送的数据...";
            byte[] bytes = str.getBytes();
            DatagramPacket dpClient = new DatagramPacket(bytes,bytes.length,
                    InetAddress.getByName("192.168.65.166"),10000);
            //发送数据
            dsClient.send(dpClient);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (dsClient != null){
                dsClient.close();
            }
        }
    }
}
