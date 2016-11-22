package elagin;

import java.awt.*;

/**
 * Created by elagin on 08.06.15.
 */
public class Box {

    Graphics2D gr2d = null;
    int[][] matrixA;

    int x = 0;
    int y = 0;
    int xSize = 0;
    int ySize = 0;

    final int xCells = 3;
    final int yCells = 3;

    Integer number = 0;

    Cell[][] cells = null;

    int xEdge = 0;
    int yEdge = 50;

    int xCellSize = 0;
    int yCellSize = 0;

    public Box(int x, int y, int xSize, int ySize, int xBox, int yBox, Tank tank) {
        matrixA = new int[3][3];

        cells = new Cell[xCells][yCells];
        this.x = x;
        this.y = y;
        this.xSize = xSize;
        this.ySize = ySize;

        xCellSize = xSize / xCells;
        yCellSize = ySize / yCells;

        xEdge = x;
        yEdge = y;

        for (int j = 0; j < yCells; j++) {
            for (int i = 0; i < xCells; i++) {
//                System.out.printf("[%d]x[%d] -", i, j);
                cells[i][j] = new Cell(xEdge, yEdge, xCellSize, yCellSize, tank.getValue(i + xBox * 3, j + yBox * 3));
                xEdge = xEdge + xCellSize;
            }
            yEdge = yEdge + yCellSize;
            xEdge = x;
        }
    }

    public void draw(Graphics2D gr2d) {
        this.gr2d = gr2d;

//        gr2d.setPaint(Color.green);
//        gr2d.drawString(number.toString(), x + (xSize / 2), y + (ySize / 2));

        if (gr2d != null) {
            gr2d.setPaint(Color.green);
            gr2d.drawRect(x, y, xSize, ySize);
        }

        for (int j = 0; j < yCells; j++) {
            for (int i = 0; i < xCells; i++) {
                cells[i][j].draw(gr2d);
            }
        }
    }
}
