package elagin;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main  extends JFrame {

    final int xSize = 300;
    final int ySize = 300;

    final int xBoxes = 3;
    final int yBoxes = 3;

    final int yShift = 100;

    Box[][] boxes = null;

    Tank tank = new Tank();

    final int valuesSize = 9;
    int values[][] = new int[valuesSize][valuesSize];


    public static void main(String[] args) {
        Main app = new Main();
    }

    public Main() {
        super("simpleApp");
        setSize(xSize, ySize + yShift);
        setVisible(true);

        boxes = new Box[xBoxes][yBoxes];
        int xEdge = 0;
        int yEdge = 50;

        int xBoxSize = xSize / xBoxes;
        int yBoxSize = ySize / yBoxes;

        int cnt = 0;

        generator();

        for (int j = 0; j < yBoxes; j++) {
            for (int i = 0; i < xBoxes; i++) {
                boxes[i][j] = new Box(xEdge, yEdge, xBoxSize, yBoxSize, cnt++);
                xEdge = xEdge + xBoxSize;
            }
            yEdge = yEdge + yBoxSize;
            xEdge = 0;
        }
    }

    private void drawBoxes(Graphics2D gr2d) {
        for (int j = 0; j < yBoxes; j++) {
            for (int i = 0; i < xBoxes; i++) {
                boxes[i][j].draw(gr2d);
            }
        }
    }

    private void generator() {
        for(int i = 0; i < valuesSize; i++) {
            int newValue = tank.getValue();
            //System.out.println(newValue);
        }
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.setBackground(Color.gray);
        gr2d.clearRect(0, 0, xSize, ySize + yShift);

//        gr2d.setPaint(Color.WHITE);
//        int xDiv = xSize / 3;
//        int yDiv = ySize / 3;
//        gr2d.drawLine(xDiv, 0, xDiv, ySize);
//        gr2d.drawLine(xDiv * 2, 0, xDiv * 2, ySize);
//
//        gr2d.drawLine(0, yDiv, xSize, yDiv);
//        gr2d.drawLine(0, yDiv * 2, xSize, yDiv * 2);

        drawBoxes(gr2d);

        //cell.setup(gr2d);
        //cell.draw();

        // Рисуем простые линии
//        gr2d.setPaint(Color.RED);
//        gr2d.drawLine(300, 50, -50, 300);

//        gr2d.setPaint(Color.BLUE);
//        gr2d.drawLine(500, 50, 300, 300);
        // Рисуем многоугольник (треуголник или звезда
        // частный случай многоугольника)
//        BasicStroke с = new BasicStroke(3); //толщина линии 3  многоугольника
//        gr2d.setStroke(с);

        //drawTable(g, gr2d);

//        gr2d.setPaint(Color.MAGENTA);
//        Polygon j = new Polygon();
//        j.addPoint(270, 439);
//        j.addPoint(185, 400);
//        j.addPoint(100, 470);
//        j.addPoint(200, 550);
//        j.addPoint(240, 590);
//        j.addPoint(270, 539);
//        g.drawPolygon(j);

//        gr2d.setPaint(Color.YELLOW);
//        gr2d.drawRoundRect(200, 50, 200, 300, 200, 400);
//
//        gr2d.setPaint(Color.DARK_GRAY);
//        //Прямоугольник с закругленными краями
//        gr2d.drawRoundRect(500, 500, 70, 40, 10, 10);
//        // Фигура овал
//        gr2d.drawOval(300, 50, 300, 300);
//        // Заполненный овал
//        gr2d.fillOval(100, 50, 200, 300);

//        gr2d.setPaint(Color.pink);
//        gr2d.drawArc(100, 200, 300, 300, ABORT, ABORT);

        // Получаем толстую линию
//        gr2d.setPaint(Color.lightGray);
//        BasicStroke p = new BasicStroke(10); //толщина линии 20
//        gr2d.setStroke(p);
//        //Овал с толстой линией
//        gr2d.drawOval(100,100,300,300);

//        gr2d.setPaint(Color.red);
//        //Получаем цветной треугольник
//        for (int i = 0; i < 30; i++) {
//            gr2d.setPaint(Color.getHSBColor(5+i*350, 5+i*100, 5+i*100));
//            gr2d.drawLine(400 + i*5, 400- i*6, 400 + i*4, 400 + i*3);
//        }


        //clearRect очищает указанную область(координаты левого верхнего                      //угла прямоугольника;
        //width — ширина прямоугольника;
        //height — высота прямоугольника, вырезанная область зеленого цвета                 // фона



//        gr2d.clearRect(0, 0, xSize, ySize);

//        gr2d.setPaint(Color.pink);
//        gr2d.drawRect(0, 0, xSize / 2, ySize / 2);

    }

    public void drawTable(Graphics g, Graphics2D gr2d) {

        gr2d.setPaint(Color.MAGENTA);
        Polygon j = new Polygon();
        j.addPoint(270, 439);
        j.addPoint(185, 400);
        j.addPoint(100, 470);
        j.addPoint(200, 550);
        j.addPoint(240, 590);
        j.addPoint(270, 539);
        g.drawPolygon(j);
    }
}
