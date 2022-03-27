package creational.prototype;

public class ItemA extends PrototypeItem{
    public ItemA(String x, String y, String z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public PrototypeItem clone() {
        return new ItemA(this.x, this.y, this.z);
    }
}
