package by.Andrey.lesson11;

public class OopLessonRaunner {

    public static void main(String[] args) {
        double value =2.2;
        int intValue = (int)value;
        Computer lapTop = new LapTop(new Ssd(250), new Ram(1024), 2);
        System.out.println("test проверка");
        Computer mobile = new mobile(new Ssd(250), new Ram(1024));
        loadComputer(lapTop,mobile);
        LapTop lapTop1 = new LapTop(new Ssd(5000), new Ram(10000), 10);
        printInfo(new Computer[]{lapTop,mobile,lapTop1});


    }
public static void printInfo(Computer[] computers){
        for(Computer computer : computers){
            computer.print();
            if(computer instanceof LapTop){
                ((LapTop) computer).Open();
            }
        }
}
    public static void loadComputer(Computer...computers){
        for(Computer computer:computers ){
            computer.load();
        }
    }
}
