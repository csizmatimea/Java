package JavaCore.Task8Fank;

import JavaCore.Task8Fank.ChocoDonuts;

public class DonutsMain {
    public static void main(String[] args) {
        ChocoDonuts csokifank = new ChocoDonuts("wheel", 10, "chocolate", "flour", "isn't", 50);

        System.out.println(csokifank.toString());
        csokifank.runsOut();
        csokifank.taste();
        csokifank.rise();
        csokifank.feed();
        csokifank.fatten();
        csokifank.filling();

        JamDonut levarosfank=new JamDonut("wheel", 10, "jam","flour", "isn't", 50);
        System.out.println(levarosfank.toString());
        levarosfank.runsOut();
        levarosfank.taste();
        levarosfank.rise();
        levarosfank.feed();
        levarosfank.fatten();
        levarosfank.jamFilling();
    }
}
