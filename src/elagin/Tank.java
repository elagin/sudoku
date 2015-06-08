package elagin;

/**
 * Created by elagin on 08.06.15.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tank {

    int valuesSize = 9;

    List<Integer> tank = new ArrayList<Integer>();
    Random rand = new Random();

    int dryRest = 9;

    public Tank() {

        for(int i = 1; i <= valuesSize; i++ ) {
            tank.add(i);
        }
    }

    public int getValue() {
        int index = rand.nextInt(dryRest);
        dryRest--;
        int res = tank.get(index);
        tank.remove(index);
        //System.out.printf("res: [%d], index: [%d], dryRest: [%d]\n", res, index, dryRest);
        return res;
    }
}
