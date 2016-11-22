/**
 * Created by elagin on 08.06.15.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tank {

    int valuesSize = 9;

    public class FreeLine {

        // Список доступных индексов
        List<Integer> line = new ArrayList<>();

        int dryRest = 9;

        public FreeLine() {
            for (int i = 1; i <= valuesSize; i++) {
                line.add(i);
            }
        }

        public void clean(int value) {
            line.remove(value);
        }

//        public int getValue() {
//            int index = rand.nextInt(dryRest);
//            dryRest--;
//            System.out.print(index + " - ");
//            return index;
//        }

        public int getValue() {
            int index = rand.nextInt(dryRest);
            dryRest--;
            int res = line.get(index);
            line.remove(index);
            //System.out.printf("res: [%d], index: [%d], dryRest: [%d]\n", res, index, dryRest);
            System.out.printf("[%d] -", res);
            return res;
        }
    }


    List<List<Integer>> tank = new ArrayList<>();

    //Итоговая матрица
    int res[][] = new int[valuesSize][valuesSize];

    Random rand = new Random();
    FreeLine line = null;


    public Tank() {
//        resetLine();
        for (int j = 0; j < valuesSize; j++) {
            line = new FreeLine();
            for (int i = 0; i < valuesSize; i++) {
                //prepareLine(i);
                int newValue = line.getValue();
                res[i][j] = newValue;
            }
            System.out.println("New line");
            line = null;
        }

//        for(int j = 0; j < valuesSize; j++ ) {
//            tank.add(new ArrayList<>());
//            resetLine();
//            for(int i = 0; i < valuesSize; i++) {
//                tank.get(j).add(getValue());
//            }
//            dryRest = 9;
//        }
        int a = 0;
    }

    protected void prepareLine(int colunm) {
        for (int j = 0; j < valuesSize; j++) {
            line.clean(res[j][colunm]);
        }
    }

    public int getValue(int x, int y) {
        System.out.println("Value [" + x + "]x[" + y + "] = " + res[x][y]);
        return res[x][y];
    }

//    private void resetLine() {
//        line.clear();
//        for(int i = 1; i <= valuesSize; i++ ) {
//            line.add(i);
//        }
//    }
//
//    public int getValue() {
//        int index = rand.nextInt(dryRest);
//        dryRest--;
//        int res = line.get(index);
//        line.remove(index);
//        //System.out.printf("res: [%d], index: [%d], dryRest: [%d]\n", res, index, dryRest);
//        return res;
//    }

//    private int lostItem(int x, int y) {
//        for(int j = 0; j < y; j++ ) {
//            for(int i = 0; i < x; i++) {
//                //res[i][j] = getValue();
//            }
//        }
//    }

    private void clearColunm(int num) {
        for (int j = 0; j < valuesSize; j++) {
            int value = res[num][j];
            line.clean(value);
        }
    }
}
