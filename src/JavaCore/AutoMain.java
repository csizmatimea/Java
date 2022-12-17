package JavaCore;

public class AutoMain {

    public static void main(String[] args) {
        Auto toyotaYaris = new Auto("Toyota","Yaris", 2020, 5,"kolbászszínmetál");
        Auto alfaGit = new Auto("Alfa Romeo", "Git",2006,3,"fekete");
        Auto scania = new Auto("Scania", "R500 super", 2021, 2, "tűzpiros");

        System.out.println(toyotaYaris);
        System.out.println(alfaGit);
        System.out.println(scania);
    }
}

