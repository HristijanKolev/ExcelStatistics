import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class FindTest {

    private final Find find = new Find();

    @Test
    public void TestMode(){
        Map<Integer, Integer> users = new TreeMap<>();
        users.put(1, 1);
        users.put(2, 2);
        users.put(3, 3);
        users.put(4, 4);
        users.put(5, 5);
        int id = 1;

        int mode = find.findMode(users.values());

        Assert.assertEquals(mode, 5);
    }

    @Test
    public void TestDispersion(){
        Map<Integer, Integer> users = new TreeMap<>();
        users.put(1, 1);
        users.put(2, 10);
        users.put(3, 10);
        int dispersion = (int) find.findDispersion(users);

        Assert.assertEquals(dispersion, 18);
    }


}
