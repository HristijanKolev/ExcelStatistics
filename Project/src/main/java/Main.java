import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Relative relative = new Relative();
        Find find = new Find();
        Absolute file = new Absolute();
        Map<Integer, Integer> users = file.absoluteFrequency();
        System.out.println("Absolute frequency: ");
        users.forEach((k, v) ->
                System.out.printf("User with id: %d Absolute frequency: %d", k, v).println());
        System.out.println("\n");
        Map<Integer, Double> relativeData;
        double numberOfUsers = users.size();
        relativeData = relative.relativeFrequency(users, numberOfUsers);
        System.out.println("Relative frequency: ");
        relativeData.forEach((k, v) ->
                System.out.printf("User with id: %d Relative frequency: %.2f", k, v).println());
        System.out.println("\n");
        int mode = find.findMode(users.values());
        users.forEach((k, v) -> {
            if(v == mode){
                System.out.printf("User ID with mode value is: "+k+ "\nMode is: " +v, v, k).println();
            }
        });
        float dispersion = find.findDispersion(users);
        System.out.println("Dispersion is: "+dispersion);
    }
}