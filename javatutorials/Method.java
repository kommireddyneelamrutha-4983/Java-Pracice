class Student{

    int rollno;
    String name;
    void insertinfo(int r,String n)
    {
        rollno=r;
        name=n;
    }
    void displayinfo()
    {
     System.out.println(rollno +" "+name);
    }}
    public class Method{
        public static void main(String args[])
         {
            
            Student obj1=new Student();
            obj1.insertinfo(111,"ammu");
            Student obj2=new Student();
            obj2.insertinfo(222,"amrutha");
            obj1.displayinfo();
            obj2.displayinfo();

        }

    }




