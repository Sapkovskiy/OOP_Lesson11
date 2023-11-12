package by.Andrey.lesson11;

public class OopLessonRaunner {

    public static void main(String[] args) {
        Computer lapTop = new LapTop(new Ssd(250), new Ram(1024), 2);
        System.out.println("++++++++++ нгшггзщжложж+");
        Computer mobile = new mobile(new Ssd(250), new Ram(1024));
        loadComputer(lapTop,mobile);
        printInfo(new Computer[]{lapTop,mobile});

    }
public static void printInfo(Computer[] computers){
        for(Computer computer : computers){
            computer.print();
        }
}
    public static void loadComputer(Computer...computers){
        for(Computer computer:computers ){
            computer.load();
        }
    }
}
