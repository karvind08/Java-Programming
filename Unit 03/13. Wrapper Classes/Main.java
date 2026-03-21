class Main {
    public static void main(String[] args) {
        int a = 5;
        double b = 5.65;
        Integer aObj = Integer.valueOf(a);
        Double bObj = Double.valueOf(b);
        if (aObj instanceof Integer) {
            System.out.println("An object of Integer is created.");
        }
        if (bObj instanceof Double) {
            System.out.println("An object of Double is created.");
        }
        // converts into primitive types
        int c = aObj.intValue();
        double d = bObj.doubleValue();
        System.out.println("The value of a: " + c);
        System.out.println("The value of b: " + d);
    }
}