/**
 * Name:Manohar Mutyala
 * Description: Program on Numbers Type
 * Date:17/03/2021
 */
import java.util.Scanner;

public class NumbersType {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items");
		final int NUM_ITEMS=sc.nextInt();
		int [] arr=new int[NUM_ITEMS];
		int positiveNumbersCount=0,negativeNumbersCount=0,oddNumbersCount=0,evenNumbersCount=0,zerosCount=0;
		
		System.out.println("Enter the elements of an array");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				negativeNumbersCount++;
				arr[i]*=-1;
			}
			if(arr[i]%2==1)
				oddNumbersCount++;
			if(arr[i]==0)
				zerosCount++;
		}
		positiveNumbersCount=NUM_ITEMS-negativeNumbersCount;
		evenNumbersCount=NUM_ITEMS-oddNumbersCount;
		
		
		System.out.println("positiveNumbersCount: "+positiveNumbersCount);
		System.out.println("negativeNumbersCount: "+negativeNumbersCount);
		System.out.println("oddNumbersCount: "+oddNumbersCount);
		System.out.println("evenNumbersCount"+evenNumbersCount);
		System.out.println("zerosCount"+zerosCount);
	}

}

