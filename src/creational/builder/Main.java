package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> actions = new ArrayList<>();
        actions.add(1);
        actions.add(2);
        actions.add(3);
        WorkFlow workFlow = new WorkFlow();
        workFlow.LoadActions(actions);
        workFlow.Work();
    }
}
