package by.Andrey.lesson11;

public class LapTop extends Computer{
private int weight;
    public LapTop(Ssd ssd, Ram ram,int weight) {

        super(ssd, ram);
        this.weight=weight;
        super.load();
        super.getRam();
        super.getSsd();
    }
    public void Open(){
        System.out.println("Открыл крышку");
    }

    public int getWeight() {
        return weight;
    }
}
