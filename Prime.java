
import java.io.*;
import java.util.*;
public class Prime {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int count=0;int i,j;
		if(number==1)
			System.out.println("There are no primes");
		else
		{
			for(i=2;i<=number;i++)
			{
				count=0;
				for(j=2;j<=i;j++)
				{
					if(i%j==0)
					{
						count++;
						break;
					}
				}
				if(count==0)
					System.out.println(i+"");
			}	
		}
	}
}
