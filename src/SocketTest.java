import java.io.*;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * TODO: Socket Test
 * User: xieyipeng
 * Date: 2018-08-20
 * Time: 10:58
 */
public class SocketTest {

    //TODO: 获得到服务器传来的球的数据，进行的操作
    private static void getBallList(String result) {
        result = result.trim();
        String a = "[()]";
        String[] strings = result.split(a);
        System.out.println("大小： " + strings.length / 2);
        for (int i = 0; i < strings.length; i++) {
            if (i % 2 != 0) {
                String temp = strings[i];
                String[] newStrings = temp.split(",");
                for (int j = 0; j < newStrings.length; j++) {
                    newStrings[j] = newStrings[j].trim();
                    System.out.print(Integer.valueOf(newStrings[j]) + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("F:\\java_test\\src\\icon\\1.png");
        Socket socket;
        try {
            socket = new Socket("178.128.180.92", 8000);
            String file_info = "post|h|" + file.getName() + "|" + file.length();
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file));
            BufferedOutputStream outputStream = new BufferedOutputStream(socket.getOutputStream());
            outputStream.write(file_info.getBytes());
            outputStream.flush();

            byte bytes[] = new byte[1024];
            int d = 0;
            while ((d = inputStream.read(bytes, 0, bytes.length)) != -1) {
                outputStream.write(bytes, 0, d);
                //刷新缓冲流（这里必须刷新，否则可能会丢失字节数据）
                outputStream.flush();
            }
            socket.shutdownOutput();
            byte get[] = new byte[1024];
            InputStream socketGet = socket.getInputStream();
            d = socketGet.read(get);
            String result=new String(get, 0, d);
            getBallList(result);

            inputStream.close();
            outputStream.close();
            socketGet.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
