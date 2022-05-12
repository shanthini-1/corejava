package shan.javaproject;


//import java.util.Scanner;

public class Practice {
    public static void main(String args[])
    {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("enter the number:");
      //  int number=scanner.nextInt();
        int number=4;
        int rows=3,k=0;
        for(int i=1;i<=rows;i++)
        {
            for(int 
            		space=1;space<=rows-i;++space)
            {
                System.out.print("-");
                
            }
            while(k!=2*i-1)
            {
                System.out.print(k);
                ++k;
            }
            System.out.println();
            k=0;
        }
//        scanner.close();
    }
    
}
