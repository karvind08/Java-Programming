interface Area {
    final static float pi = 3.14f;

    float compute(float a, float b);
}

class Rectange implements Area {
    public float compute(float x, float y) {
        return (x * y);
    }
}

class Circle implements Area {
    public float compute(float x, float y) {
        return (pi * x * x);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Rectange R1 = new Rectange();
        Area A1;
        A1 = R1;
        float res1 = A1.compute(10.4f, 3.2f);
        System.out.println(res1);
        Circle C1 = new Circle();
        A1 = C1;
        float res2 = A1.compute(2.3f, 5.2f);
        System.out.println(res2);

    }
}
