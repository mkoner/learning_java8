import java.util.List;
import java.util.ArrayList;

interface Message{
    void printMe(String msg);
}
public class Example2{
    public static void printIt(String message){
        System.out.println(message);
    }

    public static void main(String[] args){
        Message message = Example2::printIt;
        List<String> cars = new ArrayList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");
      cars.forEach(Example2::printIt);
        message.printMe("Good morning boys!");
    }
}
