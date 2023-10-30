abstract class hewan {
    String suara;

    public String getSuara() {
        return suara;
    }

    public void setSuara(String suara) {
        this.suara = suara;
    }
    public abstract void bersuara();

    public abstract void info();
}
interface Karnivora{

    String jenis = "karnivora";
    String makanan = "daging";

    void Jenis();
    void Makanan();


}
interface Herbivora{
    String jenis = "Herbivora";
    String makanan = "tumbuhan";

    void Jenis();

    void Makanan();
}
class Beruang extends hewan implements  Herbivora, Karnivora {
    @Override
    public void bersuara() {
        System.out.println("suara hewan : HAUMMMMMM");
    }

    @Override
    public void Jenis() {
        System.out.println(" Jenis hewan: " + Herbivora.jenis + "+" + "" + Karnivora.jenis);
    }

    @Override
    public void Makanan() {
        System.out.println("Makanan Hewan : " + Herbivora.makanan + "+" + "" + Karnivora.makanan);
    }

    @Override
    public void info() {
        System.out.println("===================");
        System.out.println("Beruang");
        bersuara();
        Makanan();
        Jenis();
    }
}

class Kuda extends hewan implements Herbivora {

    @Override
    public void bersuara() {
        System.out.println("suara hewan : HIHIHIHI");
    }

    @Override
    public void Jenis() {
        System.out.println("Jenis hewan : " + jenis);
    }

    @Override
    public void Makanan() {
        System.out.println("Makanan hewan : " + makanan);
    }


    @Override
    public void info() {
        System.out.println("===================");
        System.out.println("Kuda");
        bersuara();
        Makanan();
        Jenis();
    }
}

class Anjing extends hewan implements Karnivora {
    @Override
    public void bersuara() {
        System.out.println("suara hewan : WOOF WOOF");
    }

    @Override
    public void Makanan() {
        System.out.println(" Makanan hewan : " + makanan);

    }

    @Override
    public void Jenis() {
        System.out.println(" jenis hewan : " + jenis);
    }

    @Override
    public void info() {
        System.out.println("===================");
        System.out.println("Anjing");
        bersuara();
        Makanan();
        Jenis();
    }
}

class Kucing extends hewan implements Karnivora {
    @Override
    public void bersuara() {
        System.out.println("suara hewan : MEOWWWWW");
    }

    @Override
    public void Jenis() {
        System.out.println(" jenis hewan : " + jenis);
    }

    @Override
    public void Makanan() {
        System.out.println(" Makanan hewan :" + makanan);
    }

    @Override
    public void info() {
        System.out.println("===================");
        System.out.println("Kucing");
        bersuara();
        Makanan();
        Jenis();
    }
}

public class Main {
    public static void main(String[] args) {
        Kucing K = new Kucing();
        K.info();

        Anjing A = new Anjing();
        A.info();

        Beruang B = new Beruang();
        B.info();

        Kuda Ku = new Kuda();
        Ku.info();
    }
}