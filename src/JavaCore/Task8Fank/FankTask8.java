package JavaCore.Task8Fank;

public class FankTask8 {
    private String form;
    private int size;
    private String flavoring;
    private String material;
    private String decoration;

    public FankTask8(String form, int size, String flavoring, String material, String decoration) {
        this.form = form;
        this.size = size;
        this.flavoring = flavoring;
        this.material = material;
        this.decoration = decoration;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFlavoring() {
        return flavoring;
    }

    public void setFlavoring(String flavoring) {
        this.flavoring = flavoring;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }

    @Override
    public String toString() {
        return "FankTask8{" +
                "form='" + form + '\'' +
                ", size=" + size +
                ", flavoring='" + flavoring + '\'' +
                ", material='" + material + '\'' +
                ", decoration='" + decoration + '\'' +
                '}';
    }

    public void runsOut(){
        System.out.println("We're out of doughnuts");
    }
    public void taste(){
        System.out.println("This donut is delicious");
    }
    public void rise(){
        System.out.println("The dough will rise");
    }
    public void feed(){
        System.out.println("Donuts feed you");
    }
    public void fatten(){
        System.out.println("The donuts are fattening");
    }
}
