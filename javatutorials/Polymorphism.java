 //method overloading


 /*class Addition{
    static int add(int a,int b){
        return a+b;
    }
    static double add(double a,double b){
  return a+b;  }  
}
public class Polymorphism {
    public static void main(String[] args) {
        System.out.println(Addition.add(10,100));
        System.out.println(Addition.add(10.2,30.2));
    }

}*/

//method overriding

class Animal{
    void displayinfo()
    {
        System.out.println("i am an animal");
    }
}
class Dog extends Animal{
    void displayinfo()
    {
        System.out.println("i am a dog");
        super.displayinfo();
    }
}
class Polymorphism{
    public static void main(String[] args) {
        Dog g=new Dog();
        g.displayinfo();
    }

}