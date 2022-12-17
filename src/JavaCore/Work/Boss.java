package JavaCore.Work;

public class Boss extends Worker {
    int subordinates;

    public Boss(int worktime, int dayOff, int subordinates) {
        super(worktime, dayOff);
        this.subordinates = subordinates;
    }

    public void instructions() {
        System.out.println("The boss gives instructions");
    }

    @Override
    public String toString() {
        return "Boss{" +
                "subordinates=" + subordinates +
                ", worktime=" + worktime +
                ", dayOff=" + dayOff +
                '}';
    }
}
