package Day2;

import java.util.Scanner;

public class StringData {
	public static void main(String[] args)
	{
		String a1,a2,a3;
		Scanner s=new Scanner(System.in);
		//type sysout and hold the crtl +click on spacebar
		System.out.println("Enter the three Strings:");
		a1=s.nextLine();
		a2=s.next();
		a3=s.next();
		System.out.println(a1+"\n "+a2+"\n "+a3);
	}
}
