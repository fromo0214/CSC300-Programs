import java.util.*;

public class PerfectNumber 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        
        long n;

        long sum = 0;

        System.out.println("Enter a number: ");

        n = sc.nextLong();

        int i =1;

        while(i <= n/2)
        {
            if(n%i == 0)
            {
                sum = sum + i;
            }
            i++;
        }
        if(sum==n)
        {
            System.out.println(n + " is a perfect number.");
        }else
        System.out.println(n+ " is not a perfect number.");

    }
    

}
