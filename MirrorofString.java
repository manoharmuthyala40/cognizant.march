/**
 * Name:Manohar Mutyala
 * Description:Program of Mirror of String
 * Date:17/03/2021
 */
import java.util.Scanner;

public class MirrorofString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str=sc.next();
		System.out.println(getImage(str));
	    
	}
    private static String getImage(String pStr)
    {
    	//String reverseStr="";
    	//for(int i=pStr.length()-1;i>=0;i--)
    		//reverseStr+=pStr.charAt(i);
    	StringBuffer reverseStr=new  StringBuffer(pStr);
    	reverseStr.reverse();
    	return pStr+"|"+reverseStr;
    
    }
}

