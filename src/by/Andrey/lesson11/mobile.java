package by.Andrey.lesson11;

public class  mobile extends Computer{

    public mobile(Ssd ssd,Ram ram){

        super(ssd,ram);
    }

    @Override
    public void load() {

        System.out.println("mobilka vkl");
    }
}
