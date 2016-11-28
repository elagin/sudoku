import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by elagin on 23.11.16.
 */
public class FreeLine {

    // Список доступных индексов
    List<Integer> line = new ArrayList<>();
    Random rand = new Random();

    //int dryRest = 9;
    int valuesSize = 9;

    public FreeLine() {
        for (int i = 1; i <= valuesSize; i++) {
            line.add(i);
        }
    }

    public int getValue() {
        if(line.size() > 0) {
            int index = rand.nextInt(line.size());
            System.out.printf("New rand index %d", index);
            //dryRest--;
            int res = line.get(index);
            line.remove(index);
            System.out.printf("  get: [%d]\n", res);
            return res;
        } else {
            return 20;
        }
        //System.out.printf("res: [%d], index: [%d], dryRest: [%d]\n", res, index, dryRest);
//        System.out.printf("[%d] -", res);
//        return res;
    }

    public void deleteValues(Integer [] values){
        System.out.printf("\nDelete values ======\n");
        for(int i = 0; i < values.length; i++){
            System.out.printf("[%d] ", values[i]);
        }

        System.out.printf("\nfrom:\n");
        for(int i = 0; i < line.size(); i++){
            System.out.printf("[%d] ", line.get(i));
        }
        System.out.printf("\n");
        Set<Integer> mySet = new HashSet<Integer>(Arrays.asList(values));
        line.removeAll(mySet);

//        List<Integer> filteredList = line.stream().filter(i -> i >= 3).collect(Collectors.toList());
//        line.stream().filter()

//        for(int i = 0; i < values.length; i++){
//            line.remove(values[i]);
//        }

        System.out.printf("\nRemaining %d values ======\n", line.size());
        for(int i = 0; i < line.size(); i++){
            System.out.printf("[%d] ", line.get(i));
        }
        System.out.printf("\n\n");
    }
}
