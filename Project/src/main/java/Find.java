import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class Find {

    public int findMode(Collection<Integer> values) {
        return Collections.max(values);
    }

    public float findDispersion(Map<Integer,Integer> users) {
        float dispersion;
        float powValue;
        float tempValue = 0F;
        int sum = 0;

        for (int f : users.values()) {
            sum += f;
        }
        int number = users.size();
        float average = sum/(float)number;

        for (int f : users.values()) {
            powValue = (float) Math.pow((f - average),2);
            tempValue += powValue;
        }
        dispersion = tempValue/number;
        return dispersion;
    }
}
