import java.awt.*;

/**
 * Created by elagin on 08.06.15.
 */
public class Box {

    Graphics2D gr2d = null;

    int x = 0;
    int y = 0;
    int xSize = 0;
    int ySize = 0;

    final int xCells = 3;
    final int yCells = 3;

    Cell[][] cells = null;

    int xEdge = 0;
    int yEdge = 50;

    int xCellSize = 0;
    int yCellSize = 0;

    public Box(int x, int y, int xSize, int ySize) {
        cells = new Cell[xCells][yCells];
        this.x = x;
        this.y = y;
        this.xSize = xSize;
        this.ySize = ySize;

        xCellSize = xSize / xCells;
        yCellSize = ySize / yCells;

        xEdge = x;
        yEdge = y;
    }

    public void fillCells(FreeLine line) {
        //FreeLine line = new FreeLine();
        for (int j = 0; j < yCells; j++) {
            for (int i = 0; i < xCells; i++) {
                int newValue = line.getValue();
                cells[i][j] = new Cell(xEdge, yEdge, xCellSize, yCellSize, newValue);
                xEdge = xEdge + xCellSize;
            }
            yEdge = yEdge + yCellSize;
            xEdge = x;
        }
    }

    public void fillCells(int y, FreeLine line) {
        //System.out.printf("Create [%d] line\n", y);
//        for (int j = 0; j < yCells; j++) {
        System.out.printf("Line: %d\n", y);
            for (int i = 0; i < xCells; i++) {
                int newValue = line.getValue();
                cells[i][y] = new Cell(xEdge, yEdge, xCellSize, yCellSize, newValue);
                //System.out.printf("[%d] ", y);
                xEdge = xEdge + xCellSize;
            }
            yEdge = yEdge + yCellSize;
            xEdge = x;
        System.out.printf("\n", y);
  //      }
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

    public Integer [] getRowValues(int y){
        System.out.printf("getRow %d Values:\n", y);
        Integer [] res = new Integer[3];
        for(int i = 0; i < 3; i++) {
            Cell cell = cells[i][y];
            if(cell != null) {
                res[i] = cell.getValue();
                System.out.printf("%d ", cell.getValue());
            }
        }
        System.out.printf("\n");
        return res;
    }
}
