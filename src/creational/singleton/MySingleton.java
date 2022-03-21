package creational.singleton;

public class MySingleton {

    String variable;
    private static MySingleton mySingleton;

    private MySingleton(String variable){
        this.variable = variable;
    }

    public static MySingleton getMySingleton(String variable){
        if (mySingleton == null){
            mySingleton = new MySingleton(variable);
        }
        return mySingleton;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }
}
