import java.util.List;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.Arrays;
import java.util.stream.Stream;

public class Example1{

    

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 18);
        Stream<Integer> oddNumbers = numbers.stream().filter(n->n%2!=0);
        oddNumbers.forEach(System.out::println);
    }
}