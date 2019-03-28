package tenMarks;

import java.util.Scanner;
public class VowelsCount {

	public static void main(String[] args) {

		int count=0;
		Scanner sc=new Scanner(System.in);
		String str=new String();
		str=sc.nextLine();
		int len=str.length();
		str=str.toLowerCase();
		char arr[]=new char[len];
		arr=str.toCharArray();
		
		for(int i=0;i<len;i++) {
			
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
