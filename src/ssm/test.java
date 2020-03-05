package ssm;

public class test {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String a = GetPostUtil.sendPostRequest("http://192.168.0.1/cgi-bin/send_node.cgi", "type=11&id=3&data=0x01}");
                System.out.println(a);

            }
        }).start();
    }
}

