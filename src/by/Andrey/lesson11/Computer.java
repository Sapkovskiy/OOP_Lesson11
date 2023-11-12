package by.Andrey.lesson11;

public class Computer {
    private Ssd ssd;
    private Ram ram;
    {
        System.out.println("Comp init block ");
    }
    static{
        System.out.println("static comp");
    }
    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }
    public Computer(){
        System.out.println("Constructor computer");
    }
    public void load(){
        System.out.println("Я загрузился!");
    }

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }
}
