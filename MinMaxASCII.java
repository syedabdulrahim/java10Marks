package tenMarks;

import java.util.Scanner;

public class MinMaxASCII {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String str=new String();
		str=sc.nextLine();
		char temp;
		int len=str.length();
		
		
		char arr[]=new char[len];
		arr=str.toCharArray();
		
		
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
			}
		}
		
		System.out.print(arr[len-1]);
		System.out.print(arr[0]);	
	}

}
