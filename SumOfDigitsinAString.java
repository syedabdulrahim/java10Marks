package tenMarks;

import java.util.Scanner;

public class SumOfDigitsinAString {

	public static void main(String[] args) {
		
		int temp=0;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		String str=new String();
		str=sc.nextLine();
		char arr[]=new char[str.length()];
		
		arr=str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			
			
			if(arr[i]>=48 && arr[i]<=57) {
				
				temp=arr[i]-48;
				sum=sum+temp;
			}
			
		}
		
		System.out.println(sum);
	}

}
