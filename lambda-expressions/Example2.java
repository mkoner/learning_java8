public class Example2{
    interface StringInterface{
        String getString(String s);
    }

    public static void main(String[] args){
        StringInterface morning = (s) -> "Good morning " + s + "!";
        StringInterface afternoon = s -> "Good afternoon " + s + "!";
        StringInterface evening = s -> "Good evening " + s + "!";
        printGreeting("Mamadou", morning);
        printGreeting("Mariam", afternoon);
        
    }

    private static void printGreeting(String name, StringInterface time){
        System.out.println(time.getString(name));
    }
}