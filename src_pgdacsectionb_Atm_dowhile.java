package pgdacsectionb;

import java.util.Scanner;

public class Atm_dowhile {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int pass,i=1;
		do{
		System.out.println("enter password");
		pass=s.nextInt();
        if(pass==1234)
        	{
        	System.out.println("access allowed");
        	break;
        	}
           i++;
		}
		while(i<=3);
		if(i==4)
			System.out.println("card blocked");
		
	}

}
