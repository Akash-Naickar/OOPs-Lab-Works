import java.util.*;
import java.io.*;

public class R1
{
public static void main(String[] args)
{
int n=0, i=0, t=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements to be added to the array: ");
n=sc.nextInt();
int[] arr = new int[n];

for(i = 1; i <= n; i++)
{
if(n<=10000){
if(i%10 == 1)
{
System.out.println("Enter the "+i+"st element");
t = sc.nextInt();
t = arr[i];
}
if(i%10 == 2)
{
System.out.println("Enter the "+i+"nd element");
t = sc.nextInt();
t = arr[i];
}
if(i%10 == 3)
{
System.out.println("Enter the "+i+"rd element");
t = sc.nextInt();
t = arr[i];
}
}
else
{
System.out.println("Enter the "+i+"th element");
t = sc.nextInt();
t = arr[i];
}
}
System.out.println("Your array of elements is: "+arr);
}
}
