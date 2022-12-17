package JavaCore.Task8Fank;

public class ChocoDonuts extends FankTask8 {
    public static Object filling;
    int cocoaContent;

    public ChocoDonuts(String form, int size, String flavoring, String material, String decoration, int cocoaContent) {
        super(form, size, flavoring, material, decoration);
        this.cocoaContent=cocoaContent;
    }


    @Override
    public String toString() {
        return "ChocoDonuts{" +
                "cocoaContent=" + cocoaContent +
                ", form='" + getForm() + '\'' +
                ", size=" + getSize() +
                ", flavoring='" + getFlavoring() + '\'' +
                ", material='" + getMaterial() + '\'' +
                ", decoration='" + getDecoration() + '\'' +
                '}';
    }

    public void filling(){
        System.out.println("We are making a chocolate filling");
    }
}
