package tenMarks;

import java.util.Scanner;
public class MinAscii {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);	
		String str=new String();
		char arr[]=new char[str.length()];
		str=sc.nextLine();
		char temp;
		arr=str.toCharArray();
		int len=str.length();
		
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				
				
			}
		}
		
System.out.println(arr[0]);
}

}
