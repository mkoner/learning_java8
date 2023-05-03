public class Example1{

    interface ArithmeticOperation{
        int operation(int a, int b);
    }

    public static void main(String[] args){
        ArithmeticOperation addition = (a, b) -> a + b;
        System.out.println(operate(12, 4, addition));
    }

    private static int operate(int a, int b, ArithmeticOperation op){
        return op.operation(a, b);
    }
}