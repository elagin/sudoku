import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by elagin on 23.11.16.
 */
public class FreeLine {

    // Список доступных индексов
    List<Integer> line = new ArrayList<>();
    Random rand = new Random();

    int dryRest = 9;
    int valuesSize = 9;

    public FreeLine() {
        for (int i = 1; i <= valuesSize; i++) {
            line.add(i);
        }
    }

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
