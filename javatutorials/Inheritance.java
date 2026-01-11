
//single inheritance
/*class Parent{
    public void hello()
    {
        System.out.println("python life");

    }}
     class Child extends Parent{
        public void print(){

        
        System.out.println("python");
        }
        
       }
       class Inheritance{
        public static void main(String[] args) {
           Child g=new Child();
           g.print();
           g.hello(); 
        }
       }*/


       //multilevel inheritance

     /*   class Parent{
        public void hello()
        {
            System.out.println("hello");
    
        }}
         class Child1 extends Parent{
            public void print(){
    
            
            System.out.println("hiii");
            }
            
           }
           class Child2 extends Child1{
            void fun()
            {
                System.out.println("hooooo");
            }
           }
           class Inheritance{
            public static void main(String[] args) {
                Child2 obj=new Child2();
                obj.fun();
                obj.print();
                obj.hello();
            }
           } */


           //hierarichal inheritance

           /*class A {
            void funA()
                {
                    System.out.println("class A");
                }
            
           }
           class B extends A {
            void funB()
                {
                    System.out.println("class B");
                }
            
           }
           class C extends A {
            void funC()
                {
                    System.out.println("class C");
                }
            
           }
           class D extends A {
            void funD()
                {
                    System.out.println("class D");
                }
            
           }
           class Inheritance{
            public static void main(String[] args) {
                B obj1=new B();
                obj1.funB();
                obj1.funA();

                C obj2=new C();
                obj2.funC();
                obj2.funA();

                D obj3=new D();
                obj3.funD();
                obj3.funA(); 
            }
           }*/

           //multiple inheritance

           /*interface A{
             public void execute(int num);

           }
       interface B{
       public  void execute(int num);
       }
       class C implements A,B{
         public void execute(int num)
{
System.out.println("hello "+" "+ num);
}       }
class Inheritance{
    public static void main(String[] args) {
        C obj=new C();
        obj.execute(16);
    }
} */

//hybrid inheritace 
//combining two inheritances








