package by.Andrey.lesson11;

public class LapTop extends Computer{
private int weight;

    public LapTop(Ssd ssd, Ram ram,int weight) {

        super(ssd, ram);
        this.weight=weight;
        //super.load();
        super.getRam();
        super.getSsd();
    }
    public LapTop(){
        System.out.println("Constructor laptop");
    }

    @Override
    public void load() {
Open();
        System.out.println("ia zagruzilsia");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("weight: "+ weight);
    }

    public void Open(){
        System.out.println("Открыл крышку");
    }

    public int getWeight() {
        return weight;
    }
}
