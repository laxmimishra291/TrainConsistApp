import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet (maintains order + no duplicates)
        Set<String> trainFormation = new LinkedHashSet<>();

        // Adding bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Adding duplicate bogie
        trainFormation.add("Sleeper"); // Duplicate (ignored)

        // Display formation
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);
    }
}