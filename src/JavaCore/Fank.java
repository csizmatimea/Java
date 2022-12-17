package JavaCore;

public class Fank {

    private String form;
    private int size;
    private String taste;
    private String material;
    private String decoration;

    public Fank() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
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

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
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


    public Fank(String form, int size, String taste, String material, String decoration) {
        this.form = form;
        this.size = size;
        this.taste = taste;
        this.material = material;
        this.decoration = decoration;
    }
}
