interface BookStore {
    int sell();

    int buy();

    int customers();
}

@FunctionalInterface
interface Library { // extends BookStore
    boolean issue_book();
}

public class Main4 {
    public static void main(String[] args) {
        // Implementation
    }
}
