//default constructor

/*class Bike{
     Bike()
    {
    System.out.println("hello");
    }
}


public class Constructors {
    
        public static void main(String [] args){
            Bike obj=new Bike();
        }
    

    
}*/

//parameterized constructor

/*import java.lang.String;

class Student{
    int rollno;
    String name;

Student(int i,String n)
{ 
     rollno=i;
     name=n;

}
void display(){
    System.out.println(rollno+ " " +name);
}}
public class Constructors{
    public static void main(String[] args) {
         Student obj=new Student(111,"ammu");
         obj.display();

    }
}*/

//overload constructor
/*class Student{
    int rollno;
    String name;
    int age;

Student(int i,String n)
{ 
     rollno=i;
     name=n;

}
Student(int i,String n,int a)
{ 
     rollno=i;
     name=n;
     age =a;

}
void display(){
    System.out.println(rollno+ " " +name +" "+ age);
}}
public class Constructors{
    public static void main(String[] args) {
         Student obj=new Student(111,"ammu");
         Student obj1=new Student(111,"ammu",23);
         obj.display();
         obj1.display();

    }}*/
