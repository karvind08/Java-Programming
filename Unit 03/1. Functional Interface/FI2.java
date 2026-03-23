interface Animal {
    String animalname(String name);
}

public class FI2 implements Animal {
    public String animalname(String name) {
        return "Hello " + name;
    }

    public static void main(String[] args) {
        FI2 F = new FI2();
        String res = F.animalname("Lion");
        System.out.println(res);

    }
}
