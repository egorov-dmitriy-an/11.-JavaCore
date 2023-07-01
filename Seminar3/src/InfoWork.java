import java.util.ArrayList;

public class InfoWork {
    static ArrayList<Worker> infoWorkers;

    public static void info(ArrayList<Worker> workers) {
        for (Worker w : workers) {
            System.out.println("Name: " + w.name + "\t" + "Salary: " + w.salary());
        }
    }
}