
import java.io.*;
import java.util.Scanner;
public class Trafficlights {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Signal=sc.nextInt();
		
		switch(Signal)
		{
		
		case 1:System.out.println("Red:Stop");
		break;
		case 2:System.out.println("yellow:Ready");
		break;
		case 3:System.out.println("Green:Go");
		break;
		default: System.out.println("Not a valid input");
		}
		
	}

}
