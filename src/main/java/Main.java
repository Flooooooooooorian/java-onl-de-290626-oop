public class Main {


    static void main() {


        //Florians Tasse:

        Tasse floriansTasse = new Tasse("123dh", 250, false, new String[]{"grau", "weiß"}, "abgerundet");

//        floriansTasse.size = 250;
//        floriansTasse.material = "keramik";
//        floriansTasse.thermo = false;
//        floriansTasse.form = "abgerundet";
//        floriansTasse.color = new String[]{"grau", "weiß"};

        System.out.println(floriansTasse.size);
        System.out.println(floriansTasse.thermo);
        System.out.println(floriansTasse.material);
        System.out.println(floriansTasse.form);


        Tasse stanislavsTasse = new Tasse("metall", 200, false, new String[]{"schwarz", "silber"}, "round");
        Tasse jpTasse = new Tasse("material");

    }
}
