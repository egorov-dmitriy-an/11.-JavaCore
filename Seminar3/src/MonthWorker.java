public class MonthWorker extends Worker {

    public MonthWorker(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    @Override
    public double salary() {
        return rate;
    }
}