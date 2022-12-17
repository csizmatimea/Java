package JavaCore.Task8Fank;

public class JamDonut extends FankTask8 {

    int fruitContent;

    public JamDonut(String form, int size, String flavoring, String material, String decoration, int fruitContent) {
        super(form, size, flavoring, material, decoration);
        this.fruitContent = fruitContent;
    }

    @Override
    public String toString() {
        return "JamDonut{" +
                "fruitContent=" + fruitContent +
                ", "+ super.toString()+
                '}';
    }

    public void jamFilling() {
        System.out.println("We are making a jam filling");
    }
}

