interface MyInt {
    int add(int a, int b);
}

class Main3 {
    public static void main(String[] args) {
        MyInt obj1 = (a, b) -> a + b;
        // Invalid
        // var obj = (a, b) -> a + b;
    }
}