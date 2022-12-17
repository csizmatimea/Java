package JavaCore.Work;

public class WorkersMain {
    public static void main(String[] args) {
        Boss peterKovacs = new Boss(10,5,8);
        System.out.println(peterKovacs.toString());

        Assigned petraKovacs=new Assigned(8,15,"Kovács Péter");
        System.out.println(petraKovacs.toString());


    }
}
