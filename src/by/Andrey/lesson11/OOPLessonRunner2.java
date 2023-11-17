package by.Andrey.lesson11;

public class OOPLessonRunner2 {
    public static void main(String[] args) {
        Printable lapTop = new LapTop(new Ssd(250), new Ram(1024), 2);
        Printable mobile = new mobile(new Ssd(250), new Ram(1024));
        print(lapTop,mobile);
    }
    public static void print(Printable...objects){
        for (Printable object : objects) {
            object.print();
            System.out.println();
        }
    }
}
