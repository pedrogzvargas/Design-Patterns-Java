package creational.singleton;

public class Main {
    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.getMySingleton("singleton");
        System.out.println(mySingleton.getVariable());

        MySingleton mySingleton1 = MySingleton.getMySingleton("creational.singleton 1");
        System.out.println(mySingleton1.getVariable());
    }
}
