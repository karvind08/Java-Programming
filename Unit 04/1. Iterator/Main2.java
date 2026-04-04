import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

class CustomCollection implements Iterable<String> {
    private List<String> items = new ArrayList<>();

    public void add(String item) {
        items.add(item);
    }

    @Override
    public Iterator<String> iterator() {
        return items.iterator();
    }
}

public class Main2 {
    public static void main(String[] args) {
        CustomCollection collection = new CustomCollection();
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Cherry");

        for (String fruit : collection) {
            System.out.println(fruit);
        }
    }
}