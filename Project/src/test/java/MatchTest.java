import org.junit.Assert;
import org.junit.Test;

public class MatchTest {


    private final Match match = new Match();

    @Test
    public void IfTheIndexIsFound(){
        String data = "asdgrterter1234dfvlkjgdfiodsf";
        int id = match.findID(data);

        Assert.assertEquals(id, 1234);
    }

    @Test
    public void IfTheIndexIsNotFound(){
        String data = "kljgfdws987iwf";
        int id = match.findID(data);

        Assert.assertEquals(id, -1);
    }

}
