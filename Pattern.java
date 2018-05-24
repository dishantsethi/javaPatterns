import java.util.Scanner;
public class Pattern{

     public static void main(String []args)
     {  Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int x=sc.nextInt();
        for(int i=1;i<=x;i++)
        {    System.out.print(" \n");
            for(int j=1;j<=i;j++)
            System.out.print(i);
        }
         System.out.print("\n");

System.out.println("Enter number:");
        int y=sc.nextInt();

        for(int i = y; i>=1; i--)
{
           for(int j = y; j>i; j--)
              System.out.print(" ");
           
           for(int k = 1; k<=i; k++)
           {
           System.out.print("*");
           }
           System.out.println("");
}    

       System.out.print("\n");

System.out.println("Enter number:");
        int z=sc.nextInt();
	   
	   for(int i = 1; i<=z; i++)
	   {
		  for(int j = z; j>i; j--)
                  System.out.print(" "); 
                  for(int k = 1; k<=i; k++)
                  System.out.print(i);
                  System.out.print("\n"); 

        }
        
        
     }
	 
}