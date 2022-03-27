package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class WorkFlow implements Executer{
    List<Integer> actions = new ArrayList<>();

    public void Action1(){
        System.out.println("Acción 1");
    }

    public void Action2(){
        System.out.println("Acción 2");
    }

    public void Action3(){
        System.out.println("Acción 3");
    }

    @Override
    public void LoadActions(List<Integer> actions) {
        this.actions.addAll(actions);
    }

    @Override
    public void Work() {
        for (Integer action : this.actions) {
            switch (action){
                case 1 -> this.Action1();
                case 2 -> this.Action2();
                case 3 -> this.Action3();
                default -> throw new IllegalStateException("Unexpected value: " + action);
            }
        }
    }
}
