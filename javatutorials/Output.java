
//* 
//pattern
/*
int k=1;
for(int i=1;i<=n;i++)
{
for( int j=1;j<=i;j++)
{
System.out.print(k + " ");
k++;
}
System.out.println();
}
sc.close();
}}

//pyramid

for(int i=1;i<=n;i++){
for(int s=1;s<=n-i;s++)
{
System.out.print(" ");
}
for(int j=1;j<=2*i-1;j++)
{
System.out.print(j);
}
System.out.println();}

for(int i=n;i>=1;i--){
for(int s=1;s<=n-i;s++)
{
System.out.print(" ");
}
for(int j=1;j<=2*i-1;j++)
{
System.out.print(j);
}
System.out.println();
}}}*/
import java.util.Scanner;
class Output{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)

System.out.print("*");

for(int s=1;s<=2*(n-i);s++)

 System.out.println(" ");
 

for(int j=1;j<=i;j++)

System.out.print("*");

System.out.println();
}


for(int i=n;i>=1;i--)
{
for(int j=1;j<=i;j++)

System.out.print("*");

for(int s=1;s<=2*(n-i);s++)

 System.out.println(" ");
 

for(int j=1;j<=i;j++)

System.out.print("*");

System.out.println();}

}}

