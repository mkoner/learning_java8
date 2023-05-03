import java.util.List;
import java.util.ArrayList;

public class Example1{

    public static void main(String[] args){
      List<String> cars = new ArrayList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");
      cars.forEach(System.out::println);
    }
  
		
    
}