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

int rows = 5, b = 0;

        for(int a = 1; a <= rows; ++a, b = 0) {
            for(int space = 1; space <= rows - a; ++space) {
                System.out.print("  ");
            }

            while(b != 2 * a - 1) {
                System.out.print("* ");
                ++b;
            }

            System.out.println();

//rectangle pattern
int i, j; 
           
        for (i = 1; i <= n; i++) 
        { 
            for (j = 1; j <= n; j++) 
            { 
                if (i == 1 || i == n || j == 1 || j == n)             
                    System.out.print("*");             
                else           
                    System.out.print(" ");             
            } 
            System.out.println(); 
        } 

