package A_Deneme;

public class Ev {

    public Ev() {
        this(5);
        System.out.println("döndük dolaştık geldik. bitti.");
    }

    public Ev(int x) {
        this(5, 6);
        System.out.println(" 1 pli çalıştı.");
    }

    public Ev(int a, int b) {
        this(5, 6, 7);
        System.out.println(" 2 pli çalıştı.");
    }

    public Ev(int k, int l, int m) {
        System.out.println(k + " " + l + " " + m);
        System.out.println(" 3 pli çalıştı.");
    }
}
