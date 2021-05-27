import java.util.Scanner;
class Sum{
   public static void main(String args[])
{
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter no of element is:");
      int n=scanner.nextInt();
      int array[] = new int[5];
      int sum = 0;
           for (int i=0; i<n; i++)
      {
        System.out.println("Enter the element "+(i+1));
    	  array[i] = scanner.nextInt();
      }
       for (int i=0; i<n; i++)
      {
          sum = sum+array[i];
      }
      System.out.println("Sum of array elements is:"+sum);
   }
}