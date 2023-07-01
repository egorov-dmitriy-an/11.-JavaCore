import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        MonthWorker Alex = new MonthWorker("Alex", 50000);
        MonthWorker Petr = new MonthWorker("Petr", 60000);
        HourWorker Mike = new HourWorker("Mike", 400);
        HourWorker Ivan = new HourWorker("Ivan", 500);

        ArrayList<Worker> workers = new ArrayList<>() {
            {
                add(Alex);
                add(Petr);
                add(Mike);
                add(Ivan);
            }
        };

        InfoWork.infoWorkers = workers;
        InfoWork.info(workers);
    }
}