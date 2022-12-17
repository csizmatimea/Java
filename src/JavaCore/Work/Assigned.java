package JavaCore.Work;

public class Assigned extends Worker {
    String nameOfTheBoss;

    public Assigned(int worktime, int dayOff, String nameOfTheBoss) {
        super(worktime, dayOff);
        this.nameOfTheBoss = nameOfTheBoss;
    }

    public void instructed() {
        System.out.println("The subordinate receives an instruction");
    }

    @Override
    public String toString() {
        return "Assigned{" +
                "nameOfTheBoss='" + nameOfTheBoss + '\'' +
                ", worktime=" + worktime +
                ", dayOff=" + dayOff +
                '}';
    }
}
