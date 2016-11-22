package elagin;

import java.awt.*;

/**
 * Created by elagin on 08.06.15.
 */
public class Cell {

    Graphics2D gr2d = null;
    int x = 0;
    int y = 0;
    int xSize = 0;
    int ySize = 0;

    Integer number = 0;

    Integer value = 0;

    public Cell(int x, int y, int xSize, int ySize, int number, int value) {
        this.x = x;
        this.y = y;
        this.xSize = xSize;
        this.ySize = ySize;
        this.number = number;
        this.value = value;
    }

    public void draw(Graphics2D gr2d) {
        this.gr2d = gr2d;

        gr2d.setPaint(Color.yellow);
        gr2d.drawString(value.toString(), x + (xSize / 2), y + (ySize / 2));

        if(gr2d != null) {
            gr2d.setPaint(Color.white);
            gr2d.drawRect(x, y, xSize, ySize);
        }
    }

}
