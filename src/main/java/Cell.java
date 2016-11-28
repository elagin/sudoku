import java.awt.*;

/**
 * Created by elagin on 08.06.15.
 */
public class Cell {

    private Graphics2D gr2d = null;
    private int x = 0;
    private int y = 0;
    private int xSize = 0;
    private int ySize = 0;
    private Integer value = 0;

    Color normalColor = Color.blue;
    Color invalidColor = Color.red;

    public Cell(int x, int y, int xSize, int ySize, int value) {
        this.x = x;
        this.y = y;
        this.xSize = xSize;
        this.ySize = ySize;
        this.value = value;
    }

    public void draw(Graphics2D gr2d) {
        this.gr2d = gr2d;

        gr2d.setPaint(normalColor);
        gr2d.fillRect(x, y, xSize, ySize);

        gr2d.setPaint(Color.yellow);
        gr2d.drawString(value.toString(), x + (xSize / 2), y + (ySize / 2));

        if (gr2d != null) {
            gr2d.setPaint(Color.white);
            gr2d.drawRect(x, y, xSize, ySize);
        }
    }

    public int getValue() {
        return value;
    }
}
