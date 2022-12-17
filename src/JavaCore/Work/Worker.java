package JavaCore.Work;

public class Worker {
    public int worktime;
    public int dayOff;

    public Worker(int worktime, int dayOff) {
        this.worktime = worktime;
        this.dayOff = dayOff;
    }

    public int getWorktime() {
        return worktime;
    }

    public int getDayOff() {
        return dayOff;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "worktime=" + worktime +
                ", dayOff=" + dayOff +
                '}';
    }

    public void work() {
        System.out.println("The worker is working");
    }
}
