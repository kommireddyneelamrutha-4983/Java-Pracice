public class Controlstatements {
    public static void main(String[] args) {
       //Conditional statements
        //if 
       /*  int x=5;
        int y=10;
        if(x+y > 10)
        {
            System.out.println(" x+y is greater than 10");
        }*/
        // if-else
       /*  int x=5;
        int y=10;
        if(x+y >20)
{
    System.out.println(" x+y is greater than 10");
}
else{
    System.out.println(" x+y is not greater than 10");
}
    }*/
    // if else if ladder
   /*  int x=10;
    int y=20;
    if(x+y >50)
    {
        System.out.println(" x+y is greater than 50");
    }
    else if(x+y >40)
    {
        System.out.println(" x+y is greater than 40");
    }
    else{
        System.out.println(" x+y is greater than 20");
    }*/
    //nested if
    /*int x=10;
    int y=20;
    if(x+y >25)
    {
        if(x+y>10)
        {
            System.out.println(" x+y is greater than 10 & 25");
        }
    }
    else{
        System.out.println(" x+y is not greater than 25");
    }*/
    //switch case
    /*int x=20;
    switch(x)
    {
        case 10:
        System.out.println(" x is  10");
        break;
        case 20:
        System.out.println(" x is  20");
        break;
        case 30:
        System.out.println(" x is  30");
        break;
        default:
        System.out.println(" x is not in 20 30 10");    }*/



        //looping or iterative statements
        // for loop
       /*  int n=10;
        for(int i=0;i< n;i++)
        {
            System.out.println(" after loop i=" + i);
        }*/
        //while
        /*int i=5;
        while(i<10)
        {
            System.out.println(i);
            i++;
        }*/
        //do while
        /*int i=0;
        do{
            System.out.println(i);
            i++;
        }
        while(i<5);*/


        //jumping -statements
         
        //break
         /*int n=10;
        for(int i=0;i< n;i++)
        {
             if(i == 6){
             break;}
            System.out.println(i);} */

            //continue

           int n=10;
        for(int i=0;i< n;i++)
        {
             if(i == 6){
             continue ;
            }
            System.out.println(i);}

    
}}
