public class HourWorker extends Worker {

    public HourWorker(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    @Override
    public double salary() {
        return rate * 20.8 * 8;
    }
}