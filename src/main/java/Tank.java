import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by elagin on 06.11.15.
 */
class Tank {

    private final int valuesSize = 9;

    private List<Integer> tank = new ArrayList<Integer>();
    private final Random rand = new Random();

    private int dryRest = 9;

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
