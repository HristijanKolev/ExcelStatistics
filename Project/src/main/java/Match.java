import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match {
    private static final String PATTERN = "(.?)([0-9]{4})(.?)";
    public int findID(String description){
        Pattern r = Pattern.compile(PATTERN);
        Matcher m = r.matcher(description);
        int id = -1;
        if (m.find()) {
            id = Integer.parseInt(m.group(2));
        } else {
            System.out.println("NO MATCH");
        }
        return id;
    }
}
