package Day2;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
	int a,b,c;
	System.out.println("Enter the values:");
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	b=s.nextInt();
	c=a+b;
	System.out.println("The addition of a="+a+" and b="+b+" is "+c);
	}

}
