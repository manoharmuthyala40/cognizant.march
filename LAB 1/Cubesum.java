
import java.io.*;

public class Cubesum {
	public static int cube(int n)
	{
		Scanner sc=new Scanner(System.in);
		int rem=0;
		int sum=0;
		while(n>0)
		{
			rem=n%10;
			sum+=rem*rem*rem;
			n=n/10;
		}
		return sum;
		}
public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int result=cube(num);
		System.out.println(result);
		

}

}
