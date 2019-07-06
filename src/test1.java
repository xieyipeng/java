import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class test1 extends JPanel {
    private static final long serialVersionUID = 1L;
    static List<Point> shangzuoline = new ArrayList<Point>();
    static List<Point> shangyouline = new ArrayList<Point>();
    static List<Point> list = new ArrayList<Point>();

    static {
        int x1 = 0, y1 = 100;
        int x2 = 50, y2 = 100;
        Point p1 = new Point();
        p1.setX(x1);
        p1.setY(y1);
        list.add(p1);

        Point p2 = new Point();
        p2.setX(x2);
        p2.setY(y2);
        list.add(p2);
    }

    Point p1 = new Point();

    public test1() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        int size = list.size();
                        int x = list.get(size - 1).getX();
                        x += 1;
                        if (x <= 500) {
                            Point p = new Point();
                            p.setX(x);
                            p.setY(100);
                            list.add(p);
                            repaint();//调用paint方法，画出当前点集合的线
                            Thread.sleep(10);
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    @Override
    public void paint(Graphics g) {//重写画图的方法
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 1; i < list.size(); i++) {
            g2.setColor(Color.red);
            g2.drawLine(list.get(i - 1).getX(), list.get(i - 1).getY(),
                    list.get(i).getX(), list.get(i).getY());
        }
    }


    public static void main(String[] args) {
        JFrame jf = new JFrame();
        test1 dd = new test1();
        jf.setBounds(600, 250, 700, 450);
        jf.getContentPane().add(dd);
        jf.setVisible(true);
    }
}
