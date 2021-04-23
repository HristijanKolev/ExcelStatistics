import java.util.Map;
import java.util.TreeMap;

public class Relative {


    public Map<Integer, Double> relativeFrequency(Map<Integer, Integer> users, double numberOfUsers) {
        Map<Integer, Double> relativeData = new TreeMap<>();
        users.forEach((k, v) -> {
            double relativeValue = v / numberOfUsers;
            relativeData.put(k, relativeValue);
        });
        return relativeData;
    }
}
