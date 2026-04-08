import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        // ✅ Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // ✅ Initialize Train Consist (empty list of bogies)
        List<String> trainConsist = new ArrayList<>();

        // ✅ Display Initial Bogie Count
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // ✅ Program continues
        System.out.println("Program is running...");
    }
}