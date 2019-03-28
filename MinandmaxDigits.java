package tenMarks;

import java.util.Scanner;

public class MinandmaxDigits {

	public static void main(String [] args) {

		
	int temp=0;
	int max=0;
	int least=0;
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int num2=num;
	while(num!=0) {
	
		temp=num%10;
		if(max<temp) {
			max=temp;
			
		}
		num=num/10;
	
	}
	while(num2!=0) {
		
		temp=num2%10;
		if(least>temp) {
			least=temp;
			
		}
		num2=num2/10;
	
	}
	
	sc.close();
	System.out.println(max);
	System.out.println(least);
	}
}
