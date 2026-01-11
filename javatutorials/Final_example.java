//final variable
/*public class Ammu{
    final int max=120;
    public void display()
    {
        max=200;
        System.out.println(max);
    }
}
public class Final_example {
    public static void main(String[] args) {
        Ammu obj=new Ammu();
        obj.display();
    }
    
}*/

//final method
/*class Bike{
    final void run()
    {
        System.out.println("bike is running");
    }
}
class Honda extends Bike{
    void run(){};
    void horn()
    {
        System.out.println("hellooo");
    }

}
class Final_example{
    public static void main(String[] args) {
        Honda obj=new Honda();
        obj.run();
    }
}*/
//final class

import javax.smartcardio.CardPermission;

final class Cars{
    void start()
    {
        System.out.println("hihhfgd");

    }
}
class Car extends Cars{
    void hello()
    {
        System.out.println("gfds");
    }

}
public class Final_example{
public static void main(String[] args) {
    Car v =new Car();
    v.start();
}
}
