class Counter{
    static int count=0;//static variable

    static void increment()//static method
    {
        count++;
    }
}

public class Staticex {
    public static void main(String[] args) {
        Counter.increment();
        System.out.println(Counter.count);
        Counter.increment();
        System.out.println(Counter.count);
    }
    
}
