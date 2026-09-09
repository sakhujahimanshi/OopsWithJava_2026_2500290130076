package OopsWithJava_2026_2500290130076;

public class Overloading {
    public static void main(String[] args) {
        Addition obj = new Addition();

        obj.sum();
        obj.sum(10, 20);
        obj.sum(10.5, 20.5);
    }
}

class Addition {
    void sum() {
        System.out.println("Addition");
    }

    void sum(int a, int b) {
        System.out.println("Addition " + (a + b));
    }

    void sum(double a, double b) {
        System.out.println("Addition " + (a + b));
    }
}
