package mathemetical;

import java.util.Scanner;

public class Main {
   
   public static boolean Prime(int nPrime)
   {
       if(nPrime==1)
       {
           return false ;
       }
       
      for (int i = 2; i <=nPrime/2; i++) 
           {
               System.out.println("Looping: "+i);
               if(nPrime%i==0)
               {
                   return false ;
               }
           }
      
     return true ;
   }
   
   public static boolean Even(int nEven)
   {
       if(nEven%2==0)
       {
           return true ;
       }
       else 
       {   return false ;}
   }
   
    public static void main(String[] args) 
    {
        int even_number , prime_number,i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the prime number: ");
       prime_number = scan.nextInt();
        int prime_found = 0 ;
       for ( i = 0; i < prime_number; i++) 
        {
           System.out.println("Looping: "+i);
            
          if(!Prime(i))
            {
                       continue; 
             }
            System.out.println("Prime num: "+i);
           
           if(Prime(i))
            {
                prime_found++;
                System.out.println("Prime number: "+i);
            }
            if(prime_found==9)
            {
                break;
            }
          
        
        System.out.println("Enter the even number: ");
        even_number = scan.nextInt();
        int even_found = 0 , sum_even=0;
        i=0;
        while(i<even_number)
        {
            i++;
            System.out.println("Looping: "+i);
            if(!Even(i))
            {
                even_found++;
                   
                       continue; 
             }
            System.out.println("Even num: "+i);
            /*if(Even(i))
            {
                even_found++;
                System.out.println("Even num: "+i);
            }*/
            if(even_found == 2)
            {
                break;
            }
            sum_even+=i;
        }
        System.out.println("TOTAL SUM OF EVEN: "+sum_even);
    
    }
    }
