
import javax.swing.*;
import java.awt.*;

public class test extends JFrame {

    public test() {
        this.setBounds(600, 250, 700, 450);
        this.setContentPane(new Paint());
        setVisible(true);
    }

    public static void main(String[] args) {       //主函数
        test hap = new test();       //实例化主类

        java.awt.EventQueue.invokeLater(new Runnable() { //运行图形化界面
            public void run() {
                hap.setVisible(true);
            }
        });
    }

    class Paint extends JPanel {

        public void paint(Graphics g) {
            g.setColor(Color.pink);

            g.fillOval(230, 150, 240, 120);

            g.setColor(Color.orange);
            g.drawRect(280, 140, 140, 50);
            g.fillOval(280, 110, 140, 60);
            g.fillOval(280, 160, 140, 60);
            g.fillRect(280, 140, 140, 50);

            g.setColor(Color.black);
            g.drawOval(280, 110, 140, 60);
            g.drawOval(230, 150, 240, 120);

            g.drawArc(230, 220, 240, 120, 0, -180);

            g.drawLine(280, 140, 280, 190);
            g.drawLine(420, 140, 420, 190);
            g.drawLine(230, 210, 230, 280);
            g.drawLine(470, 210, 470, 280);

            g.setColor(Color.orange);
            g.drawArc(230, 150, 240, 120, 55, 125);

            g.setColor(Color.red);
            g.setFont(new Font("楷体", Font.BOLD, 35));
            g.drawString("生    乐", 270, 305);
            g.drawString("日快", 310, 315);
            g.setColor(Color.black);
            g.drawString("李润阳", 300, 80);

        }
    }

}
