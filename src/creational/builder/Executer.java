package creational.builder;

import java.util.List;

public interface Executer {
    void LoadActions(List<Integer> actions);
    void Work();
}
