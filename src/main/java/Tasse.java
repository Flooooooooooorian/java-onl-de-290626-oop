public class Tasse {

    String material;
    int size;
    boolean thermo;
    String[] color;
    String form;

    public Tasse() {

    }

    public Tasse(String material) {
        this.material = material;
    }

    public Tasse(String material, int size, boolean thermo, String[] color, String form) {
        this.material = material;
        this.size = size;
        this.thermo = thermo;
        this.color = color;
        this.form = form;
        System.out.println("Eine neue Tasse wurde erstellt!");
    }

}
