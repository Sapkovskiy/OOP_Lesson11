package by.Andrey.lesson11;

public class OopLessonRaunner {

    public static void main(String[] args) {
        Ram ram =new Ram(1024);
        Ssd ssd =new Ssd(500);
        Computer computer = new Computer(ssd,ram);
        computer.load();
        double sin =Math.sin(2.5);
        LapTop lapTop=new LapTop(new Ssd(255),new Ram(1024),2);
        lapTop.Open();
        lapTop.load();
    }
}
