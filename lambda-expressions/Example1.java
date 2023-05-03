public class Example1{

    interface ArithmeticOperation{
        int operation(int a, int b);
    }

    public static void main(String[] args){
        ArithmeticOperation addition = (a, b) -> a + b;
        ArithmeticOperation subtraction = (int a, int b) -> a - b;
        ArithmeticOperation mutiplication = (a, b) -> {return a * b;};
        ArithmeticOperation division = (a, b) -> {
   
                return  a/b;
            
            
        };
        System.out.println(operate(12, 4, addition));
        System.out.println(operate(12, 4, subtraction));
        System.out.println(operate(12, 4, mutiplication));
        System.out.println(operate(12, 3, division));
    }

    private static int operate(int a, int b, ArithmeticOperation op){
        return op.operation(a, b);
    }
}