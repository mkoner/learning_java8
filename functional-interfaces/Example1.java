@FunctionalInterface 
interface Printer{
    void printMessage(String msg);
}
public class Example1 implements Printer{
    public void printMessage(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args){
        Example1 ex = new Example1();
        ex.printMessage("Good afternoon!");
    }
}