package networkstudy.review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package networkstudy.review
 * @description 客户端
 * @date 2020-05-05 15:57:39
 */
public class ClientDemo {
    public static void main(String[] args) {
        DatagramSocket dsClient = null;
        BufferedReader bfRead = null;

        try {
            dsClient = new DatagramSocket();
            /* //发送固定的内容
            String str = "萧然真帅呀";

            byte[] bytes = str.getBytes();
            DatagramPacket dpClient = new DatagramPacket(bytes,0,bytes.length,
                    InetAddress.getByName("192.168.65.166"),9090);
            dsClient.send(dpClient);*/

            //发送多条自定义内容
            bfRead = new BufferedReader(new InputStreamReader(System.in) );
            String line = null;
            while ((line = bfRead.readLine() ) != null){
                if (line.equals("exit")){
                    break;
                }
                byte[] bytes = line.getBytes();
                DatagramPacket dpCli = new DatagramPacket(bytes,bytes.length,
                        InetAddress.getByName("192.168.65.166"),9090);
                dsClient.send(dpCli);
            }
            System.out.println("客户端已退出");

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (dsClient != null){
                dsClient.close();
            }
            try {

                if (bfRead != null){
                    bfRead.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
