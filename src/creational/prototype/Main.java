package creational.prototype;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ItemA itemA = new ItemA("x", "y", "z");
        ArrayList items = new ArrayList();

        for (int x=0; x<10; x++) {
            PrototypeItem item = itemA.clone();
            System.out.println(item.getX());
            items.add(item);
        }

        int itemsSize = items.size();
        for (Object item : items) {
            System.out.println(item);
        }
    }
}
