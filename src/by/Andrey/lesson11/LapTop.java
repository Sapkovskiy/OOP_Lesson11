package by.Andrey.lesson11;

public class LapTop extends Computer{
private int weight;
    {
        System.out.println("Laptop init block ");
    }
    static{
        System.out.println("static laptop");
    }
    public LapTop(Ssd ssd, Ram ram,int weight) {

        super(ssd, ram);
        this.weight=weight;
        super.load();
        super.getRam();
        super.getSsd();
    }
    public LapTop(){
        System.out.println("Constructor laptop");
    }
    public void Open(){
        System.out.println("Открыл крышку");
    }

    public int getWeight() {
        return weight;
    }
}
