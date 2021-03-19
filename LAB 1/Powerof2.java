/**
 * Name: Manohar Mutyala
 * Description:Program on power of 2
 * Date:16/03/2021
 */
import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int number=sc.nextInt();
       System.out.println(checkNumber(number));
	}
	public static  boolean checkNumber(int n)
	{
		boolean status=false;
		int i=1,mul=1;
		while(i>0)
		{
			mul*=2;
			if(mul==n)
			{
				status=true;
				break;
			}
			else if(mul>n)
				break;
			i++;
		}
	    
		return status;
	}

}

