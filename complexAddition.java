import java.util.Scanner;
class complexNo
{
 int real,img;
 Scanner sc=new Scanner(System.in);
 void read()
 {
   System.out.println("Enter the real part:");
   this.real=sc.nextInt();
   System.out.println("Enter the imaginary part:");
   this.img=sc.nextInt();
 }
 void display()
 {
  System.out.println("the complex number: "+this.real+"+"+this.img+"i");
 }
 void add(complexNo c1,complexNo c2)
  {
   real=c1.real+c2.real;
   img=c1.img+c2.img;
   System.out.println("The sum of complex number is: "+real+"+"+img+"i");
  }
}
class complexAddition
{
  public static void main(String arg[])
  {
    complexNo c1=new complexNo();
    complexNo c2=new complexNo();
    complexNo c3=new complexNo();
     System.out.println("----- first complex No----");
    c1.read();
    c1.display();
    System.out.println("----- second complex No----");
    c2.read();
    c2.display();
    c3.add(c1,c2);
  }
}
