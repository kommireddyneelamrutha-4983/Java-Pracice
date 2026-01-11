//to access current class instance variable

/*class Students{
    int id;
    int age;
    String name;
    Students(int id,String name,int age)
{
   this. id=id;
   this. name=name;
    this.age=age;
}
void display(){
    System.out.println(id+" "+name+" "+age);
}}
public class Thiskeyword {

    public static void main(String[] args) {
        Students obj1=new Students(335,"ammu",23);
        Students obj2=new Students(336,"amrutha",24);
        obj1.display();
        obj2.display();
    }
    
}*/


//to access current class method

/*class A{
    void m()
    {
        System.out.println("hello this is m");
    }
    void n()
    {
        System.out.println("hello this is n");
      this.m();
    }}
    class Thiskeyword{
        public static void main(String[] args) {
            A a=new A();
            a.n();}
        }*/


        //to access current class constructor

        class A{
            A()
            {
                System.out.println("hello amrutha");
            }
            A(int x){
             this();
            System.out.println(x); }
               }
               class Thiskeyword{
                public static void main(String[] args) {
                    A a =new A(10);
        
                }
               }
    
