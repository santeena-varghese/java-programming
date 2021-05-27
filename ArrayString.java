import java.util.Scanner;  
public class ArrayString   
{  
public static void main(String[] args)   
{  
int n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements : ");  
n=sc.nextInt();  
String[] name = new String[10];  
System.out.println("Enter "+n+"  strings ");  
for(int i=0; i<=n; i++)  
{    
   name[i]=sc.nextLine();  
}  
System.out.println("Entered string  are: ");  
for (int i=0; i<=n; i++)   
{  
System.out.println(name[i]);  
}  
}  
}  